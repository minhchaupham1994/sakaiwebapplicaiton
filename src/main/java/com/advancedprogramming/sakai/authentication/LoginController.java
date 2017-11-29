package com.advancedprogramming.sakai.authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	private final String CURRENT_USER = "current_user"; 
	
	@Autowired
	IUserService userService;
	
	@GetMapping("/login")
	public String loginView() {
        return "login";
    }
	
	@PostMapping("/login")
    public String loginSubmit(HttpServletRequest request, Model model) {
		String userId = request.getParameter("userid");
		String password = request.getParameter("password");
		User user = userService.authenticate(userId, password);
		
		if (user != null) {
			HttpSession session = request.getSession();
			
			session.setAttribute(CURRENT_USER, user);
			return "redirect:/home";
		}
		
        return "redirect:/login?error";
    }
	
	
}
