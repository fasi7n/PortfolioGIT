package com.portfolio.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboardAction")
public class UserDashboardController {
	
	@Value("${user.dash}")
	private String userDashMsg;
	
	
	@GetMapping
	public String userDashboardAction(Model model){
		
		
	}
	

}
