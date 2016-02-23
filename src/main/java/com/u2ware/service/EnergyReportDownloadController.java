package com.u2ware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.classic.Logger;


@Controller
public class EnergyReportDownloadController {

	@Autowired
	private EnergyReportResource energyReportResource;
	
	@RequestMapping(value="/download/energyReport", method=RequestMethod.GET)
	public ModelAndView download(@RequestParam(name="daliy") String daliy) {
		 
		
		
		return null;
	}
	
	
}
