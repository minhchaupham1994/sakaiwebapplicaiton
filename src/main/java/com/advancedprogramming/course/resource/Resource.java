package com.advancedprogramming.course.resource;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.advancedprogramming.course.CourseClass;

/***********************************************************************
 * Module: Resource.java Author: ChauPham Purpose: Defines the CourseClass
 * Resource
 ***********************************************************************/

@Entity
public class Resource {
	@Id
	@Column(name = "RESOURCE_ID")
	private BigDecimal id;
	
	private String name;
	
	private String description;

	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="resource")
	private List<ResourceAttachment> attachments;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_CLASS_ID")
	private CourseClass courseClass;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ResourceAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<ResourceAttachment> attachments) {
		this.attachments = attachments;
	}

	public CourseClass getCourseClass() {
		return courseClass;
	}

	public void setCourseClass(CourseClass courseClass) {
		this.courseClass = courseClass;
	}
}