package com.onlinecrime.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.onlinecrime.Exceptions.CriminalNotFoundException;
import com.onlinecrime.Service.PoliceLoginServiceT;
import com.onlinecrime.Service.WantedCriminalServiceT;
import com.onlinecrime.bean.PoliceLoginT;
import com.onlinecrime.bean.PoliceOfficerT;
import com.onlinecrime.bean.WantedCriminalT;



@Controller
public class PoliceLoginControllerT {
	
	@Autowired
	private PoliceLoginServiceT policeLoginServiceT;
	
	@Autowired
	private WantedCriminalServiceT wcService;
	
	
	@GetMapping("/login")
	public String launchPoliceLogin(Model model) {
		PoliceLoginT pl=new PoliceLoginT();
		model.addAttribute("loginPoliceDataT", pl);
		return "policeLoginFormT";		
	}
	
	
	//@RequestMapping("/goBack")
	//public String GoBack() {
		//return "policeOfficerHomeT";
	//}
	
	//@RequestMapping("/goBack")
	//public String GoBack(Model model) {
		//model.addAttribute("loginPoliceDataT",new PoliceOfficerT());
		//return "policeOfficerHomeT";
	//}
	
	@PostMapping("/login")
	public ModelAndView doLogin(@Valid @ModelAttribute("loginPoliceDataT") PoliceLoginT policeLogin,BindingResult br) {
		if(br.hasErrors()) {
			return new ModelAndView("policeLoginFormT");
		}
		
		PoliceOfficerT po=policeLoginServiceT.authenticateOfficer(policeLogin.getUsername(), policeLogin.getPassword());
		if(po!=null)
			return new ModelAndView("policeOfficerHomeT","PoliceDataT",po);
		
		
		return new ModelAndView("invalidCredentials","","Invalid Username or password!!..");

	}
	
	
	
	
	@GetMapping("/criminal")
	public String getAllCriminals(Model model) {
		List<WantedCriminalT> criminals=wcService.getAllCriminals();
		model.addAttribute("criminalList",criminals);
		return "allCriminals";
	}
	
	
	
	@GetMapping("/rCriminal")
	public String launchCriminal(Model model) {
		WantedCriminalT wc=new WantedCriminalT();
		model.addAttribute("wcDataT",wc);
		return "criminalRegistrationT";
	}
	
	
	
	@PostMapping("/registerCriminalT")
	public ModelAndView doRegisterCriminal(@Valid @ModelAttribute("wcDataT") WantedCriminalT wcT , BindingResult br) {		
		if(br.hasErrors()) {
			return new ModelAndView("criminalRegistrationT");
		}		
		WantedCriminalT savedWC= wcService.insertCriminalRecord(wcT);		
		ModelAndView mv=new ModelAndView("criminalRegisterSuccessT","WCriminal",savedWC);		
		return mv;
		
	}
	
	
	
	@GetMapping("/search")
	public String searchCriminalLauncher() {
		return "searchCriminal";
	}
	
	
	
	@GetMapping("/byName")
	public String getByName() {
		return "searchCriminalName";
	}
	
	
	
	@PostMapping("/getNCriminal")
	public String getCriminalByName(String name,Model model) throws CriminalNotFoundException {
		List<WantedCriminalT> criminals=wcService.searchByName(name);
		if(criminals.isEmpty())
			throw new CriminalNotFoundException("Criminal Not Found!");
		model.addAttribute("nameList",criminals);
		return "criminalNameDetails";	
	}
	
	
	
	@GetMapping("/byCrime")
	public String getByCrime() {
		return "searchCriminalType";
	}
	
	
	
	@PostMapping("/getCrimeType")
	public String getByType(String crimeType,Model model) throws CriminalNotFoundException {
		List<WantedCriminalT> criminals=wcService.searchByType(crimeType);
		if(criminals.isEmpty())
			throw new CriminalNotFoundException("Criminal Not Found!");
		model.addAttribute("crimeList",criminals);
		return "criminalTypeDetails";
	}
	
	
	
	
	@GetMapping("/updateCriminal/{criminalId}")
	public String updateCriminalFormLauncher(@PathVariable Integer criminalId,Model model) throws CriminalNotFoundException {
		WantedCriminalT wct=wcService.getCriminalById(criminalId);
		model.addAttribute("upcriminal",wct);
		return "updateCriminalForm";
	}
	
	
	
	
	@PostMapping("/updateCriDetails")
	public ModelAndView doUpdateCriminal(@Valid @ModelAttribute("upcriminal") WantedCriminalT wc,BindingResult br) {
		if(br.hasErrors()) {			
			return new ModelAndView("updateCriminalForm");
		}
		wcService.updateCriminal(wc);
		return new ModelAndView("criminalUpdateSuccess");
	}
	
	
	
	
	@GetMapping("/deleteCriminal")
	public String doDeleteCriminal(@RequestParam("cid") Integer criminalId,Model model) throws CriminalNotFoundException {
		List<WantedCriminalT> wc=wcService.deleteCriminal(criminalId);
		if(wc.isEmpty())
			throw new CriminalNotFoundException("Criminal Not Found!");
		model.addAttribute("criminalList", wc);
		return "allCriminals";
	}
	
	
	
	
	@GetMapping("/logout")
	public String doLogout(HttpSession session,Model model) {		
		session.invalidate();
		PoliceLoginT pl=new PoliceLoginT();
		model.addAttribute("loginPoliceDataT", pl);
		return "policeLoginFormT";	
	}
}
