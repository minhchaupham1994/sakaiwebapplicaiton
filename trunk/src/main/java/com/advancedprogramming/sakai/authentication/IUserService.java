package com.advancedprogramming.sakai.authentication;


import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public interface IUserService {
	boolean authenticate(String userId, String password);	
}
