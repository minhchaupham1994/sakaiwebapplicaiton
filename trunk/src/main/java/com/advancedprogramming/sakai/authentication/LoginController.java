package com.advancedprogramming.sakai.authentication;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {
	@Autowired
	IUserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginView() {
        return "login";
    }
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginSubmit(HttpServletRequest request, Model model) {
		String userId = request.getParameter("userid");
		String password = request.getParameter("password");
		
		if (userService.authenticate(userId, password)) {
			//Session session = request.getSession();
		}
		
        return "login";
    }
	
	
}
