package com.advancedprogramming.course;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resources;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.advancedprogramming.course.annoucement.Announcement;
import com.advancedprogramming.course.assignment.Assignment;
import com.advancedprogramming.course.discussion.Discussion;
import com.advancedprogramming.course.gradebook.Gradebook;
import com.advancedprogramming.course.resource.Resource;
import com.advancedprogramming.sakai.authentication.Membership;

@Entity
public class CourseClass {
	@Id
	@Column(name = "COURSE_CLASS_ID")
	private BigDecimal id;
	
	private String code;
	
	private String description;

	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="courseClass")
	private List<Membership> memberships;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="courseClass")
	private List<Assignment> assignments;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="courseClass")
	private List<Discussion> discussions;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="courseClass")
	private List<Gradebook> gradebooks;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="courseClass")
	private List<Announcement> announcements;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="courseClass")
	private List<Resource> resources;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_ID")
	private Course course;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Membership> getMemberships() {
		return this.memberships;
	}

	public void setMemberships(List<Membership> memberships) {
		this.memberships = memberships;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public List<Discussion> getDiscussions() {
		return discussions;
	}

	public void setDiscussions(List<Discussion> discussions) {
		this.discussions = discussions;
	}

	public List<Gradebook> getGradebooks() {
		return gradebooks;
	}

	public void setGradebooks(List<Gradebook> gradebooks) {
		this.gradebooks = gradebooks;
	}

	public List<Announcement> getAnnouncements() {
		return announcements;
	}

	public void setAnnouncements(List<Announcement> announcements) {
		this.announcements = announcements;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}