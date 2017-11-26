package com.advancedprogramming.course.gradebook;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.advancedprogramming.course.CourseClass;
import com.advancedprogramming.sakai.authentication.User;

/***********************************************************************
 * Module: GradeBook.java Author: ChauPham Purpose: Defines the Class GradeBook
 ***********************************************************************/

@Entity
public class Gradebook {
	@Id
	@Column(name = "GRADEBOOK_ID")
	private BigDecimal id;
	
	private String title;
	
	private float grade;
	
	private String note;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USERS_ID")
	private User student;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_CLASS_ID")
	private CourseClass courseClass;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public User getStudent() {
		return student;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public CourseClass getCourseClass() {
		return courseClass;
	}

	public void setCourseClass(CourseClass courseClass) {
		this.courseClass = courseClass;
	}
}