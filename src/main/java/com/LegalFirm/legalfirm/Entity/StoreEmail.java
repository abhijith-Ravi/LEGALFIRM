package com.LegalFirm.legalfirm.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity

@Table(name="storeemail")
public class StoreEmail {



	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
