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

import com.onlinecrime.Service.AdminLoginService;
import com.onlinecrime.bean.AdminLogin;

@Controller
public class AdminLoginController {
	
	@Autowired
	private AdminLoginService adminloginservice;
	
	
	@GetMapping("/admin")
	public String loginLauncher(Model model) {
		
		AdminLogin  loginbean= new AdminLogin();
		model.addAttribute("loginData",loginbean);
		
		
		return "adminLoginForm";
		
	
	}
	
	@PostMapping("/admin")
	public ModelAndView doLogin(@Valid @ModelAttribute("loginData") AdminLogin  loginbean,BindingResult br) {
		if(br.hasErrors()) {
			return new ModelAndView("adminLoginForm");
		}
		
		AdminLogin savedloginbean=adminloginservice.authenticateAdmin(loginbean.getUsername(), loginbean.getPassword());
		if(Objects.nonNull(savedloginbean)) {
			return new ModelAndView("Admin_Dashboard","adminData",savedloginbean);
		}
		else {
			return new ModelAndView("adminLoginForm");
		}
		//return new ModelAndView("loginPoliceData","flag","Invalid Username or password!!..");

	}
	
	@GetMapping("/adminlogout")
	public String doLogout(HttpServletRequest req, HttpServletResponse res) {
		
		return "redirect:/login";	
	}
	

}
