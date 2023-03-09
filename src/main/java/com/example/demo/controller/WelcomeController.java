package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcome() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Welcome AKSHAY ....!");
		mav.setViewName("index");
		
		return mav;
		
	}
	
	
	@GetMapping("/greet")
	public ModelAndView getGreet() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "GOOD EVENING.....!");
		mav.setViewName("index");
		return mav;
	}

}
