package com.advancedprogramming.sakai.authentication;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface IUserRepository extends CrudRepository<User, BigDecimal> {

	List<User> findByEmail(String email);

}
