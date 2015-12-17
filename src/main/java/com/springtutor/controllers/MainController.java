package com.springtutor.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/show")
public class MainController {
	private MessageSource messageSource;
	
	@RequestMapping(method=RequestMethod.GET)
	public String show(Model model,Locale locale){
		String message = messageSource.getMessage("controller.message", 
				new Object[]{"MainController","show()"},locale); 
		model.addAttribute("message", message);
		return "show";
	}
	
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}	
}
