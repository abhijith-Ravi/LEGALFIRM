package com.LegalFirm.legalfirm.service;

import java.util.List;

import com.LegalFirm.legalfirm.Entity.LegalFirmEntity;
import com.LegalFirm.legalfirm.model.legalfirm;

public interface legalfirmservice {

	
	//public String createlegalfirm(LegalFirmEntity legalfirms);

	//public LegalFirmEntity getInformationbyId(int id);

	public String createlegalfirm(String name,String phone,String email,String description);
	
	public List<LegalFirmEntity> getInformationbyId() ;
}
