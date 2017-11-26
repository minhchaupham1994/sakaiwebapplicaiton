package com.advancedprogramming.course.annoucement;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.advancedprogramming.course.CourseClass;

public interface IAnnoucementRepository extends CrudRepository<Announcement, BigDecimal> {
	List<Announcement> findByCourseClass(CourseClass courseClass);
}
