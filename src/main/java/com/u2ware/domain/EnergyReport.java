package com.u2ware.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
public class EnergyReport implements Serializable {

	private static final long serialVersionUID = 4805369369931239762L;
		
	
	@Id
	@GeneratedValue
	private @Getter @Setter Long id;
	private Long no;
	
	public Long getNo() {
		return id;
	}
	public void setNo(Long no) {
		this.no = this.id;
	}
	
	@NotNull
	private @Getter @Setter String daily;	
	@NotNull @Column
	private @Getter @Setter String powerMonth; 
	@NotNull @Column
	private @Getter @Setter String powerToday; 
	@NotNull @Column
	private @Getter @Setter String co20Sum;
	@NotNull @Column
	private @Getter @Setter String co20Today;
	@NotNull @Column
	private @Getter @Setter String co20Total; 
	@NotNull @Column
	private @Getter @Setter String co21Sum;
	@NotNull @Column
	private @Getter @Setter String co21Today;
	@NotNull @Column
	private @Getter @Setter String co21Total; 
	@NotNull @Column
	private @Getter @Setter String co22Sum;
	@NotNull @Column
	private @Getter @Setter String co22Today;
	@NotNull @Column
	private @Getter @Setter String co22Total; 
	@NotNull @Column
	private @Getter @Setter String co23Sum;
	@NotNull @Column
	private @Getter @Setter String co23Today;
	@NotNull @Column
	private @Getter @Setter String co23Total; 
	@NotNull @Column
	private @Getter @Setter String co24Sum;
	@NotNull @Column
	private @Getter @Setter String co24Today;
	@NotNull @Column
	private @Getter @Setter String co24Total; 
	@NotNull @Column
	private @Getter @Setter String waterSum;
	@NotNull @Column
	private @Getter @Setter String waterToday;
	@NotNull @Column
	private @Getter @Setter String waterTotal; 
	@NotNull @Column
	private @Getter @Setter String boiler1Sum;
	@NotNull @Column
	private @Getter @Setter String boiler1Today;
	@NotNull @Column
	private @Getter @Setter String boiler1Total; 
	@NotNull @Column
	private @Getter @Setter String boiler2Sum; 
	@NotNull @Column
	private @Getter @Setter String boiler2Today;
	@NotNull @Column
	private @Getter @Setter String boiler2Total; 
	@NotNull @Column
	private @Getter @Setter String wastesSum; 
	@NotNull @Column
	private @Getter @Setter String wastesToday;
	@NotNull @Column
	private @Getter @Setter String wastesTotal; 
	@NotNull @Column
	private @Getter @Setter String heat1Sum; 
	@NotNull @Column
	private @Getter @Setter String heat1Today; 
	@NotNull @Column
	private @Getter @Setter String heat1Total; 
	@NotNull @Column
	private @Getter @Setter String heat2Sum; 
	@NotNull @Column
	private @Getter @Setter String heat2Today; 
	@NotNull @Column
	private @Getter @Setter String heat2Total; 
	@NotNull @Column
	private @Getter @Setter String oilSum; 
	@NotNull @Column
	private @Getter @Setter String oilToday; 
	@NotNull @Column
	private @Getter @Setter String oilTotal; 
	@NotNull @Column
	private @Getter @Setter String freeze1Sum; 
	@NotNull @Column
	private @Getter @Setter String freeze1Today; 
	@NotNull @Column
	private @Getter @Setter String freeze1Total; 
	@NotNull @Column
	private @Getter @Setter String freeze2Sum; 
	@NotNull @Column
	private @Getter @Setter String freeze2Today; 
	@NotNull @Column
	private @Getter @Setter String freeze2Total; 
	@NotNull @Column
	private @Getter @Setter String wattSum; 
	@NotNull @Column
	private @Getter @Setter String wattToday; 
	@NotNull @Column
	private @Getter @Setter String wattTotal; 
	@NotNull @Column(columnDefinition="int default '0'")
	private @Getter @Setter int item1Sum;
	@NotNull @Column(columnDefinition="int default '0'")
	private @Getter @Setter int item1Today;
	@NotNull @Column(columnDefinition="int default '0'")
	private @Getter @Setter int item1Total;
	@NotNull @Column(columnDefinition="int default '0'")
	private @Getter @Setter int item2Sum;
	@NotNull @Column(columnDefinition="int default '0'")
	private @Getter @Setter int item2Today;
	@NotNull @Column(columnDefinition="int default '0'")
	private @Getter @Setter int item2Total;
	
	public @Getter @Setter String d1012; 
	public @Getter @Setter String d1013; 
	public @Getter @Setter String d1014;
	
	public @Getter @Setter String d2011;
	public @Getter @Setter String d2012;
	public @Getter @Setter String d2013;
	public @Getter @Setter String d2014;
	public @Getter @Setter String d2015;
	public @Getter @Setter String d2016;
	public @Getter @Setter String d2017;

	public @Getter @Setter String d2021;
	public @Getter @Setter String d2022;
	public @Getter @Setter String d2023;
	public @Getter @Setter String d2024;
	public @Getter @Setter String d2025;
	public @Getter @Setter String d2026;
	public @Getter @Setter String d2027;
	
	public @Getter @Setter String d2031;
	public @Getter @Setter String d2032;
	public @Getter @Setter String d2033;
	public @Getter @Setter String d2034;
	public @Getter @Setter String d2035;
	public @Getter @Setter String d2036;
	public @Getter @Setter String d2037;

	
	public @Getter @Setter String d3011;
	public @Getter @Setter String d3021;
	public @Getter @Setter String d3031;
	public @Getter @Setter String d3041;
	public @Getter @Setter String d3051;
	public @Getter @Setter String d3061;
	public @Getter @Setter String d3071;
	public @Getter @Setter String d3081;
	public @Getter @Setter String d3091;
	public @Getter @Setter String d3101;
	

	public @Getter @Setter String d4011;
	public @Getter @Setter String d4012;
	public @Getter @Setter String d4013;
	public @Getter @Setter String d4014;
	public @Getter @Setter String d4015;
	public @Getter @Setter String d4016;
	
	public @Getter @Setter String d4021;
	public @Getter @Setter String d4022;
	public @Getter @Setter String d4023;
	public @Getter @Setter String d4024;
	public @Getter @Setter String d4025;
	public @Getter @Setter String d4026;

	public @Getter @Setter String d4031;
	public @Getter @Setter String d4032;
	public @Getter @Setter String d4033;
	public @Getter @Setter String d4034;
	public @Getter @Setter String d4035;
	public @Getter @Setter String d4036;

	public @Getter @Setter String d4041;
	public @Getter @Setter String d4042;
	public @Getter @Setter String d4043;
	public @Getter @Setter String d4044;
	public @Getter @Setter String d4045;
	public @Getter @Setter String d4046;

	public @Getter @Setter String d4051;
	public @Getter @Setter String d4052;
	public @Getter @Setter String d4053;
	public @Getter @Setter String d4054;
	public @Getter @Setter String d4055;
	public @Getter @Setter String d4056;

	public @Getter @Setter String d5011;
	public @Getter @Setter String d5012;
	public @Getter @Setter String d5013;

	public @Getter @Setter String d5021;
	public @Getter @Setter String d5022;
	public @Getter @Setter String d5023;

	public @Getter @Setter String d5031;
	public @Getter @Setter String d5032;
	public @Getter @Setter String d5033;

	public @Getter @Setter String d5041;
	public @Getter @Setter String d5042;
	public @Getter @Setter String d5043;

	public @Getter @Setter String d5051;
	public @Getter @Setter String d5052;
	public @Getter @Setter String d5053;

	public @Getter @Setter String d5061;
	public @Getter @Setter String d5062;
	public @Getter @Setter String d5063;

	public @Getter @Setter String d5071;
	public @Getter @Setter String d5072;
	public @Getter @Setter String d5073;

	public @Getter @Setter String d5081;
	public @Getter @Setter String d5082;
	public @Getter @Setter String d5083;

	public @Getter @Setter String d5091;
	public @Getter @Setter String d5092;
	public @Getter @Setter String d5093;

	public @Getter @Setter String d5101;
	public @Getter @Setter String d5102;
	public @Getter @Setter String d5103;

	public @Getter @Setter String d5111;
	public @Getter @Setter String d5112;
	public @Getter @Setter String d5113;

	public @Getter @Setter String d5121;
	public @Getter @Setter String d5122;
	public @Getter @Setter String d5123;

	public @Getter @Setter String d5131;
	public @Getter @Setter String d5132;
	public @Getter @Setter String d5133;

	public @Getter @Setter String d5141;
	public @Getter @Setter String d5142;
	public @Getter @Setter String d5143;

	public @Getter @Setter String d5151;
	public @Getter @Setter String d5152;
	public @Getter @Setter String d5153;

	public @Getter @Setter String d5161;
	public @Getter @Setter String d5162;
	public @Getter @Setter String d5163;

	public @Getter @Setter String d5171;
	public @Getter @Setter String d5172;
	public @Getter @Setter String d5173;

	public @Getter @Setter String d5181;
	public @Getter @Setter String d5182;
	public @Getter @Setter String d5183;

	public @Getter @Setter String d5191;
	public @Getter @Setter String d5192;
	public @Getter @Setter String d5193;
	
	public @Getter @Setter String d5201;
	public @Getter @Setter String d5202;
	public @Getter @Setter String d5203;
	
	public @Getter @Setter String d5211;
	public @Getter @Setter String d5212;
	public @Getter @Setter String d5213;
	public @Getter @Setter String d5214;
	public @Getter @Setter String d5215;
	public @Getter @Setter String d5216;
	
	public @Getter @Setter String d5221;
	public @Getter @Setter String d5222;
	public @Getter @Setter String d5223;
	public @Getter @Setter String d5224;
	public @Getter @Setter String d5225;
	public @Getter @Setter String d5226;
	
	public @Getter @Setter String d5231;
	public @Getter @Setter String d5232;
	public @Getter @Setter String d5233;
	public @Getter @Setter String d5234;
	public @Getter @Setter String d5235;
	public @Getter @Setter String d5236;
	
	public @Getter @Setter String d5241;
	public @Getter @Setter String d5242;
	public @Getter @Setter String d5243;
	public @Getter @Setter String d5244;
	public @Getter @Setter String d5245;
	public @Getter @Setter String d5246;
	
	public @Getter @Setter String d5251;
	public @Getter @Setter String d5252;
	public @Getter @Setter String d5253;
	public @Getter @Setter String d5254;
	public @Getter @Setter String d5255;
	public @Getter @Setter String d5256;
	
	public @Getter @Setter String d5261;
	public @Getter @Setter String d5262;
	public @Getter @Setter String d5263;
	public @Getter @Setter String d5264;
	public @Getter @Setter String d5265;
	public @Getter @Setter String d5266;
	
	public @Getter @Setter String d5271;
	public @Getter @Setter String d5272;
	public @Getter @Setter String d5273;
	public @Getter @Setter String d5274;
	public @Getter @Setter String d5275;
	public @Getter @Setter String d5276;

	public @Getter @Setter String d5281;
	public @Getter @Setter String d5282;
	public @Getter @Setter String d5283;
	public @Getter @Setter String d5284;
	public @Getter @Setter String d5285;
	public @Getter @Setter String d5286;

	public @Getter @Setter String d5291;
	public @Getter @Setter String d5292;
	public @Getter @Setter String d5293;
	public @Getter @Setter String d5294;
	public @Getter @Setter String d5295;
	public @Getter @Setter String d5296;

	public @Getter @Setter String d5301;
	public @Getter @Setter String d5302;
	public @Getter @Setter String d5303;
	public @Getter @Setter String d5304;
	public @Getter @Setter String d5305;
	public @Getter @Setter String d5306;


	

	public @Getter @Setter String d6011;
	public @Getter @Setter String d6012;
	
	public @Getter @Setter String d6021;
	public @Getter @Setter String d6022;

	public @Getter @Setter String d6031;
	public @Getter @Setter String d6032;

	public @Getter @Setter String d6041;
	public @Getter @Setter String d6042;

	public @Getter @Setter String d6051;
	public @Getter @Setter String d6052;

	public @Getter @Setter String d6061;
	public @Getter @Setter String d6062;

	public @Getter @Setter String d6071;
	public @Getter @Setter String d6081;
	public @Getter @Setter String d6091;

	

}
