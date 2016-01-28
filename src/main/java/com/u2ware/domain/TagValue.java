package com.u2ware.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TagValue implements Serializable {

	private static final long serialVersionUID = 4805502136931239762L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long no;
	@Column(name = "tagID", nullable = false)
	private String tagID;
	private String value;
	private String timeStamp;
	
	
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
	public String getTagID() {
		return tagID;
	}
	public void setTagID(String tagID) {
		this.tagID = tagID;
	}	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
