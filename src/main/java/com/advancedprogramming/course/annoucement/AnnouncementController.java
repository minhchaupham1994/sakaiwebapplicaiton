package com.advancedprogramming.course.annoucement;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnnouncementController {
	@Autowired
	IAnnouncementService announcementService;
	
	@RequestMapping(value = "/announcement", method = RequestMethod.GET)
    public String viewAnnouncementList(HttpServletRequest request, Model model) {
        model.addAttribute("announcements", announcementService.getAllAnnouncements());
        return "announcement-list";
    }
	
	@RequestMapping(value = "/announcement/view", method = RequestMethod.GET)
    public String viewAnnouncement(@RequestParam BigDecimal id, Model model) {
        model.addAttribute("announcement", announcementService.getAnnouncement(id));
        return "announcement";
    }

	
	@RequestMapping(value = "/announcement/edit", method = RequestMethod.GET)
    public String editAnnouncement(@RequestParam BigDecimal id, Model model) {
        model.addAttribute("announcement", announcementService.getAnnouncement(id));
        return "announcement-edit";
    }
}
