package com.training.springmvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.springmvc.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	public String email="";
	public String password="";
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value="page1",method=RequestMethod.POST)
	public ModelAndView page1(@RequestParam(value="emailid")String useremail,@RequestParam(value="password")String userpassword, Model model){
		ModelAndView modelAndView = new ModelAndView("page1");
		String abc="e-mail:"+useremail+"<br></br>      password:"+userpassword;
		User user=new User(useremail,userpassword);
		
		modelAndView.addObject("HELLO",abc);
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return modelAndView;
	}
	@RequestMapping(value="page2")
	public String page2(Model model){
		String abc="hello here and there";
		model.addAttribute("HELLO",abc);
		return "page2";
	}
}
