package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.sun.net.httpserver.Authenticator.Success;

@Controller
public class loginController {
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String showLoginForm(Model model) {
		model.addAttribute("msg", "please enter your login details");
		return "login";
	}
	
	@RequestMapping(value="login", method= RequestMethod.POST)
	public String verifyLoginForm(Model model, @ModelAttribute("loginBean") loginBean loginBean ) {
	if (loginBean!= null && loginBean.getUserName() != null && loginBean.getPassword() != null ) {
		if (loginBean.getUserName().equals("admin") && loginBean.getPassword().equals("admin")) {
			return "success";
		}
		else
		{
			model.addAttribute("error", "Invalid credentials");
			return "login";
		}
	}
	else
		{
		model.addAttribute("error", "Please enter credentials");
		return "login";
		}
	}
}
	

