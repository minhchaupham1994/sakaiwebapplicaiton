package com.advancedprogramming.course;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;

public interface ICourseClassRepository extends CrudRepository<CourseClass, BigDecimal>{
	//CourseClass findByClassId(BigDecimal id);

}
