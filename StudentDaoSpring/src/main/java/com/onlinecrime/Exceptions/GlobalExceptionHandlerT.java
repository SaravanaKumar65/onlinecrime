package com.onlinecrime.Exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerT {
	
	@ExceptionHandler(CriminalNotFoundException.class)	
	public String exceptionHandler1(CriminalNotFoundException exp,Model model) {
		System.out.println("Criminal Not found exception");
		
		model.addAttribute("expdetails", exp.getMessage());
		
		return "errorhandlerT";
	}
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler2(Exception exp,Model model) {
		
		model.addAttribute("expdetails", exp.getMessage());
		
		System.out.println("Inside Exception");
		
		return "errorhandlerT";
		
		
	}

}
