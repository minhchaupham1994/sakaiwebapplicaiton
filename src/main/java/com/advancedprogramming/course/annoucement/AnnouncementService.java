package com.advancedprogramming.course.annoucement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedprogramming.course.CourseClass;
import com.advancedprogramming.course.ICourseClassRepository;
import com.advancedprogramming.sakai.authentication.User;

@Service
public class AnnouncementService implements IAnnouncementService{
	
	@Autowired
	IAnnouncementRepository announcementRepository;
	
	@Autowired
	ICourseClassRepository coursClassRepository;

	@Override
	public List<Announcement> getAllAnnouncements() {
		//TODO: current user and current course class
		Iterable<Announcement> annIterator = announcementRepository.findAll();
		List<Announcement> announcements = new ArrayList<>();
		
		for (Announcement a: annIterator) {
			announcements.add(a);
		}
		return announcements;
	}

	@Override
	public Announcement getAnnouncement(BigDecimal id) {
		// TODO Auto-generated method stub
		Announcement a = new Announcement();
		a.setId(new BigDecimal(1));
		a.setTitle("abc");
		a.setContent("xyz");
		return a;
	}

	@Override
	public List<Announcement> getRecentAnnouncements(User user, int count) {
		List<CourseClass> courseClasses = coursClassRepository.findByUser(user);
		List<Announcement> announcements = announcementRepository.findByCourseClasses(courseClasses);
		
		if (announcements.size() > count) {
			return announcements.subList(0, count - 1);
		}		
		return announcements;
	}
	
}
