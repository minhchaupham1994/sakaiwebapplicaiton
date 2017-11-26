package com.advancedprogramming.course.assignment;

import java.math.BigDecimal;
import java.util.Date;
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
import com.advancedprogramming.sakai.authentication.User;

@Entity
public class Assignment {
	@Id
	@Column(name = "ASSIGNMENT_ID")
	private BigDecimal id;
	
	private String title;
	
	private String description;
	
	private Date startDate;
	
	private Date dueDate;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="assignment")
	private List<Submission> submissions;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_CLASS_ID")
	private CourseClass courseClass;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USERS_ID")
	private User author;
	
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
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public List<Submission> getSubmissions() {
		return submissions;
	}
	
	public void setSubmissions(List<Submission> submissions) {
		this.submissions = submissions;
	}
	
	public CourseClass getCourseClass() {
		return courseClass;
	}
	
	public void setCourseClass(CourseClass courseClass) {
		this.courseClass = courseClass;
	}
	
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	
}