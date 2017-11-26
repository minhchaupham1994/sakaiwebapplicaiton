package com.advancedprogramming.course;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;


public interface ICourseRepository extends CrudRepository<Course, BigDecimal> {
	
}
