package com.LegalFirm.legalfirm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LegalFirm.legalfirm.Entity.LegalFirmEntity;
import com.LegalFirm.legalfirm.model.legalfirm;
import com.LegalFirm.legalfirm.repository.LegalFirmRepository;
import com.LegalFirm.legalfirm.service.legalfirmservice;


@Service
public class legalfirmserviceimpl implements legalfirmservice {

	@Autowired
	private LegalFirmRepository legalFirmRepository;
//	
//	@Override
//	public String createlegalfirm(String name,String description) {
//		LegalFirmEntity legalfirms=new LegalFirmEntity();
//		
//		legalFirmRepository.save(legalfirms);
//		return "Success";
//	}

	@Override
	public List<LegalFirmEntity> getInformationbyId() {
		List<LegalFirmEntity> legalfirms= legalFirmRepository.findAll();
		return legalfirms ;
	}
@Override
public String createlegalfirm(String name,String phone,String email,String description) {
	LegalFirmEntity legalfirms=new LegalFirmEntity();
	legalfirms.setName(name);
	legalfirms.setDescription(description);
	legalfirms.setPhone(phone);
	legalfirms.setEmail(email);
System.out.println(phone);
System.out.println(email);
	legalFirmRepository.save(legalfirms);
	//legalfirms.setDescription(description);
	System.out.println("done service");
	return null;
}




	
	
}
