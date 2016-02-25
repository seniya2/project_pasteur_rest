package com.u2ware.service;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.u2ware.domain.EnergyReport;


@Controller
public class EnergyReportResourceDownloader implements ResourceLoaderAware{

	private Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private EnergyReportResource energyReportResource;
	private ResourceLoader resourceLoader;
	private ExpressionParser parser = new SpelExpressionParser();
	private TemplateParserContext parserContext = new TemplateParserContext();
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
	@RequestMapping(value="/download/energyReport", method=RequestMethod.GET)
	public ModelAndView download(@RequestParam(name="daliy") String daliy) {
		 
		final EnergyReport energyReport = energyReportResource.findByDaily(daliy).iterator().next();
    	return new ModelAndView(new AbstractXlsxView(){

    		@Override
    		protected Workbook createWorkbook(Map<String, Object> model, HttpServletRequest request) {
    			try {
           			Resource r = resourceLoader.getResource("classpath:static/EnergyLog.xlsx");
        			logger.info(r);
           			logger.info(r.exists());
           		         			
					return new XSSFWorkbook(r.getInputStream());
				} catch (IOException e) {
					e.printStackTrace();
					return new XSSFWorkbook();
				}
    		}
    		
    		protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {

    			Sheet sheet = workbook.getSheetAt(0);
    			
    			for(int rownum = sheet.getFirstRowNum(); rownum <= sheet.getLastRowNum(); rownum++ ){
    				
    				Row row = sheet.getRow(rownum);
    				
        			for(int cellnum = row.getFirstCellNum(); cellnum < row.getLastCellNum(); cellnum++ ){
        				
        				Cell cell = row.getCell(cellnum);

        				
        				try{
            				String contents = cell.getStringCellValue();       					
        					
        					Expression exp = parser.parseExpression(contents, parserContext);
        					Object value = exp.getValue(energyReport);

        					if(value != null){
        						cell.setCellValue(value.toString());
        					}else{
        						cell.setCellValue("");
        					}
        				}catch(Exception e){
        					logger.info(cell, e);
        					cell.setCellValue("");
        				}
        			}
    			}
    		}
    	});
	}

	
	
}
