package com.onlinecrime.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlinecrime.Service.CitizenService;
import com.onlinecrime.bean.CitizenBean;

@Controller
public class CitizenRegistrationController {
	
	@Autowired
	private CitizenService citizenservice;
	

	
	@GetMapping("/signUp")
	public String launchSignup(Model model) {
		
		CitizenBean emp = new CitizenBean();
		
		model.addAttribute("citizenData",emp);
		
		return  "citizenRegistrationForm";
	}
	
	@PostMapping("/registerCitizen")
	public ModelAndView registerCitizenLauncher(@Valid @ModelAttribute("citizenData") CitizenBean citizenbean, BindingResult br) {
		
		if(br.hasErrors())
			return new ModelAndView("citizenRegistrationForm");
		
		CitizenBean savedcitizenbean = citizenservice.registerCitizenService(citizenbean);
		
		ModelAndView mv = new ModelAndView("Registered_success_citizen","citizenData",savedcitizenbean);
		
		
		return mv;
		
		
	}
	}
