package com.onlinecrime.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlinecrime.Service.CitizenLoginService;
import com.onlinecrime.bean.CitizenBean;
import com.onlinecrime.bean.CitizenLoginBean;

@Controller
public class CitizenLoginController {
	
	@Autowired
	private CitizenLoginService citizenloginservice;
	
	@GetMapping("/citizenlogin")
	public String launchlogin(Model model) {
		
		CitizenLoginBean  loginbean= new CitizenLoginBean();
		model.addAttribute("loginData",loginbean);
		
		
		return "CitizenLoginForm";
	}
	
	@PostMapping("/citizenlogin")
	public ModelAndView doLogin(@Valid @ModelAttribute("loginData") CitizenLoginBean  loginbean,BindingResult br) {
		if(br.hasErrors()) {
			return new ModelAndView("CitizenLoginForm");
		}
		
		CitizenBean savedloginbean=citizenloginservice.authenticateCitizen(loginbean.getUsername(),loginbean.getPassword());
		if(Objects.nonNull(savedloginbean)) {
			return new ModelAndView("Citizen_Dashboard","citizenData",savedloginbean);
		}
		else {
			return new ModelAndView("CitizenLoginForm");
		}
		//return new ModelAndView("loginPoliceData","flag","Invalid Username or password!!..");

	}
	
	@GetMapping("/citizenlogout")
	public String doLogout(HttpServletRequest req, HttpServletResponse res) {
		
		return "redirect:/citizenlogin";	
	}

}
