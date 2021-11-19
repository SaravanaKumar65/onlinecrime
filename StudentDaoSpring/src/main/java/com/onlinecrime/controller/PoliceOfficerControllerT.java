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

import com.onlinecrime.bean.PoliceOfficerT;
import com.onlinecrime.Service.PoliceOfficerServiceT;

@Controller
public class PoliceOfficerControllerT {
	
	
	@Autowired
	private PoliceOfficerServiceT pOService;
	
	@GetMapping("/")
	public String homeLauncher() {
		
		return "homeT";
		
	}	
	
	@GetMapping("/registerOfficier")
	public String launchSignUpPage(Model model) {
		PoliceOfficerT po=new PoliceOfficerT();
		model.addAttribute("poDataT",po);
		return "policeRegistrationT";
		
	}
	
	@PostMapping("/registerPoliceT")
	public ModelAndView doRegisterPOfficer(@Valid @ModelAttribute("poDataT") PoliceOfficerT policeOfficerT , BindingResult br) {
	
		
		if(br.hasErrors()) {
			return new ModelAndView("policeRegistrationT");
		}

		
		PoliceOfficerT savedPO= pOService.registerPolice(policeOfficerT);
		
		ModelAndView mv=new ModelAndView("registerSuccessT","policeOfficer",savedPO);
		
		return mv;
		
	}

}
