package com.advancedprogramming.course;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.advancedprogramming.course.annoucement.IAnnouncementService;
import com.advancedprogramming.sakai.authentication.IUserService;
import com.advancedprogramming.sakai.authentication.User;
import com.advancedprogramming.sakai.config.SakaiConstant;

@Controller
public class HomeController {
	@Autowired
	IAnnouncementService announcementService;

	@Autowired
	IUserService userService;
	
	@RequestMapping(value = {"/home", "/"}, method = RequestMethod.GET)
    public String homeView(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute(SakaiConstant.CURRENT_USER);
		
        if (user == null) {
        	return "redirect:/login";
        } else {       	        	
        	model.addAttribute(SakaiConstant.RECENT_ANNOUNCEMENTS, 
        			announcementService.getRecentAnnouncements(user, SakaiConstant.NO_OF_RECENT_ANNOUNCEMENT));
        	return "home";
        }
    }
}
