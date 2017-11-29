package com.advancedprogramming.sakai.authentication;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
	@Autowired
	IUserRepository userRepository;

	@Override
	public User authenticate(String userId, String password) {
		try {		
			User user = userRepository.findOne(new BigDecimal(userId));
			if (user == null || password == null || !password.equals(user.getPassword())) {
				return null;
			}			
			return user;	
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public User getDefaultUser(String userId) {
		return userRepository.findOne(new BigDecimal(userId));
	}	
}
