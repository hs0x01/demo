package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@GetMapping("/hello")
	public ModelAndView index(ModelAndView mav) {
		
		mav.addObject("hello", "Hello World!!!");
		mav.setViewName("demo");
		
		return mav;
	}
}
