package com.LegalFirm.legalfirm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LegalFirm.legalfirm.Entity.StoreEmail;

public interface emailRepository extends JpaRepository<StoreEmail, String>{ 



void save(String email);
}