package com.u2ware.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GraphElectric implements Serializable {

	private static final long serialVersionUID = 4805578956931239762L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long no;
	@Column(name = "subject", nullable = false)
	private String subject;
	@Column(name = "interval", nullable = false)
	private String interval;
	@Column(name = "dateType", nullable = false)
	private String dateType;
	@Column(name = "valueType", nullable = false)
	private String valueType;
	@Column(name = "dateTime", nullable = false)
	private String dateTime;
	@Column(name = "tagIDs", nullable = false)
	private String tagIDs;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNo() {
		return id;
	}
	public void setNo(Long no) {
		this.no = this.id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public String getDateType() {
		return dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getTagIDs() {
		return tagIDs;
	}
	public void setTagIDs(String tagIDs) {
		this.tagIDs = tagIDs;
	}
	
	
	
	
}
