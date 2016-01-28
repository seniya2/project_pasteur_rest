package com.u2ware.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AlarmHvac implements Serializable {

	private static final long serialVersionUID = 4805578956956789762L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long no;
	@Column(name = "tagID", nullable = false)
	private String tagID;
	@Column(name = "condition", nullable = false)
	private String condition;
	
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
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
}
