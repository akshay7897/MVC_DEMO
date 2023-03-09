package com.example.demo.controller;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@GetMapping("/time")
	public ModelAndView getTime() {
		ModelAndView mav = new ModelAndView();

		LocalTime time = LocalTime.now();
		String msgtxt = "JUST NOW TIME ---" + time;
		mav.addObject("msg", msgtxt);
		mav.setViewName("index");

		return mav;
	}

}
