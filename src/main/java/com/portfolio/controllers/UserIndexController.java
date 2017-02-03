package com.portfolio.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserIndexController {
	
	@Value("${user.dash}")
	private String userDashMsg;
	
	
	@RequestMapping("/indexAction")
	public ModelAndView userDashboardAction(@RequestParam("actVal") String actVal, Model model){
		
		ModelAndView mav = new ModelAndView("index");
		
		
		if(actVal.equalsIgnoreCase("dashboardAction"))
		{
			
			model.addAttribute("dashSuccess", "Have to display user dashboard here");
			
			//return "index";
			
			
		}
		
		
		return mav;
		
		
	}
	

}
