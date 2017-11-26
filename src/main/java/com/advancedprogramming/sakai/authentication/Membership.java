package com.advancedprogramming.sakai.authentication;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.advancedprogramming.course.CourseClass;

/***********************************************************************
 * Module:  Membership.java
 * Author:  ChauPham
 * Purpose: Defines the Class Membership
 ***********************************************************************/

@Entity
public class Membership {
	@Id
	@Column(name = "MEMBERSHIP_ID")
	private BigDecimal id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_CLASS_ID")
	private CourseClass courseClass;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USERS_ID")
	private User user;
	
	private String role;

	public CourseClass getCourseClass() {
		return courseClass;
	}

	public void setCourseClass(CourseClass courseClass) {
		this.courseClass = courseClass;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
