package com.LegalFirm.legalfirm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class LegalfirmApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegalfirmApplication.class, args);
	}

}
