package com.advancedprogramming.sakai.authentication;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IUserService {
	@Autowired
	IUserRepository userRepository;

	@Override
	public boolean authenticate(String userId, String password) {
		try {		
			User user = userRepository.findOne(new BigDecimal(userId));
			if (user == null || password == null || !password.equals(user.getPassword())) {
				return false;
			}			
			return true;	
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
}
