package com.advancedprogramming.course.gradebook;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.advancedprogramming.course.CourseClass;
import com.advancedprogramming.sakai.authentication.User;

public interface IGradeBookRepository extends CrudRepository<Gradebook, BigDecimal> {
	//List<Gradebook> findByCourseClassAndUser(CourseClass courseclass, User user);  
}
