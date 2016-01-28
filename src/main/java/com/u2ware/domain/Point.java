package com.u2ware.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Point implements Serializable {

	private static final long serialVersionUID = 4805502123431239762L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long no;
	private String category;
	private String type;
	@Column(name = "tagID", nullable = false)
	private String tagID;
	@Column(name = "name", nullable = false)
	private String name;	
	@Column(name = "url", nullable = false)
	private String url;
	private String value;
	private String description;
	private String hasEvent;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHasEvent() {
		return hasEvent;
	}
	public void setHasEvent(String hasEvent) {
		this.hasEvent = hasEvent;
	}
	
	
	
	
	
	
}
