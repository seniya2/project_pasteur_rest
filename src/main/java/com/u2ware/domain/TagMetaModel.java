package com.u2ware.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TagMetaModel implements Serializable {

	private static final long serialVersionUID = 4805502136931239762L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long no;
	@Column(name = "tagID", nullable = false)
	private String tagID;
	@Column(name = "tagAddr", nullable = false)
	private String tagAddr;
	private String category;
	private String categoryAddr;
	private String type;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "description", nullable = true)
	private String description;
	@Column(name = "groupName", nullable = true)
	private String groupName;
	private String animateType;
	
	
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
	public String getTagAddr() {
		return tagAddr;
	}
	public void setTagAddr(String tagAddr) {
		this.tagAddr = tagAddr;
	}
	public String getCategoryAddr() {
		return categoryAddr;
	}
	public void setCategoryAddr(String categoryAddr) {
		this.categoryAddr = categoryAddr;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getAnimateType() {
		return animateType;
	}
	public void setAnimateType(String animateType) {
		this.animateType = animateType;
	}

	
	
	
}
