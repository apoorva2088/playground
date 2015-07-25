package com.two95.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SpringExp {
	String message = "My Information";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			@RequestParam(value = "age", required = false, defaultValue = "26") String age,
			@RequestParam(value = "phone", required = false, defaultValue = "12345") String phone,
			@RequestParam(value = "email", required = false, defaultValue = "apoorva@gmail.com") String email)
			
			 {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("Info");
		mv.addObject("message", message);
		mv.addObject("name", name);
		mv.addObject("age", age);
		mv.addObject("phone", phone);
		mv.addObject("email", email);
		return mv;
	}
	
	
	

}
