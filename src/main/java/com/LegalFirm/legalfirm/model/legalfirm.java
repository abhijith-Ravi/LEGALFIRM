package com.LegalFirm.legalfirm.model;

import lombok.Data;

public class legalfirm {


	private String name;
	//private double phoneNumber;
	private String Description;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	
}
