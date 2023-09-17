package com.LegalFirm.legalfirm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LegalFirm.legalfirm.Entity.LegalFirmEntity;
import com.LegalFirm.legalfirm.model.legalfirm;

public interface LegalFirmRepository extends JpaRepository<LegalFirmEntity, String>{

	void save(legalfirm legalfirms);

	LegalFirmEntity findById(int id);
	}

