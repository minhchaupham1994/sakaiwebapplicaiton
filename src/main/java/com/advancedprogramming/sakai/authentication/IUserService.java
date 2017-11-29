package com.advancedprogramming.sakai.authentication;


import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public interface IUserService {
	User authenticate(String userId, String password);
	User getDefaultUser(String userId);	
}
