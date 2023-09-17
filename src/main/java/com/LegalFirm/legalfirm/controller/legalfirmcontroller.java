package com.LegalFirm.legalfirm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.LegalFirm.legalfirm.Entity.LegalFirmEntity;
import com.LegalFirm.legalfirm.service.legalfirmservice;



@RestController
@RequestMapping("/legalfirm")


public class legalfirmcontroller {
 
	@Autowired
	private legalfirmservice legalfirmservices;
	
	@PostMapping(value="/create")
	public String createNewQuery(@RequestParam("name") String name,@RequestParam("phone") String phone,@RequestParam("email") String email,@RequestParam("description") String description) {
		legalfirmservices.createlegalfirm(name,phone,email,description);
		System.out.println("done saved");
		return "Your request has been recorded";
		
	}
	
	@GetMapping()
	public  List<LegalFirmEntity> getInformation() {
		List<LegalFirmEntity> legalfirms=legalfirmservices.getInformationbyId();
		//legalfirms=legalfirmservices.getInformationbyId();
		return legalfirms;
	}

	



}
