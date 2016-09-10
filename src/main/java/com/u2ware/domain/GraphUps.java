package com.u2ware.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class GraphUps implements Serializable {

	private static final long serialVersionUID = 4805578912331239762L;
	
	@Id
	@GeneratedValue
	private @Getter @Setter Long id;
	private Long no;
	@Column(name = "subject", nullable = false)
	private  @Getter @Setter String  subject;	
	@Column(name = "tagIDs", nullable = false)
	private  @Getter @Setter String tagIDs;
		
	public Long getNo() {
		return id;
	}
	public void setNo(Long no) {
		this.no = this.id;
	}
	
	
}
