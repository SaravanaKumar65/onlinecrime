package com.onlinecrime.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlinecrime.Service.CitizenComplaintService;
import com.onlinecrime.bean.CitizenComplaintBean;

@Controller
public class CitizenComplaintController {
	
	@Autowired
	private CitizenComplaintService citizencomplaintservice;
	
	@GetMapping("/complaint/{citizenId}")
	public String launchSignup(@PathVariable Integer citizenId, Model model) {
		System.out.println(citizenId);
		CitizenComplaintBean complaint = citizencomplaintservice.getComplaintByID(citizenId);
		System.out.println(complaint);
		model.addAttribute("citizenComplaintData",complaint);
		
		return  "citizenComplaintForm";
	}
	
	@PostMapping("/registerComplaint")
	public ModelAndView registerCitizenLauncher(@Valid @ModelAttribute("citizenComplaintData") CitizenComplaintBean citizencomplaintbean, BindingResult br) {
		
		if(br.hasErrors())
			return new ModelAndView("citizenComplaintForm");
		
		CitizenComplaintBean savedcitizencomplaintbean = citizencomplaintservice.registerCitizenComplaintService(citizencomplaintbean);
		
		ModelAndView mv = new ModelAndView("Registered_Complaint_success","citizenComplaintData",savedcitizencomplaintbean);
		
		
		return mv;
		
		
	}
	

}
