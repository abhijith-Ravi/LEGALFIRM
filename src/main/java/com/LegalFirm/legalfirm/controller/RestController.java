package com.LegalFirm.legalfirm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LegalFirm.legalfirm.Entity.StoreEmail;
import com.LegalFirm.legalfirm.repository.emailRepository;

@org.springframework.web.bind.annotation.RestController
public class RestController {
     
    @Autowired
    JavaMailSender javaMailSender;
    
    @Autowired
    private emailRepository emailrepository;
     
     @PostMapping("/sendEmail")
        public String helloSpringBoot(@RequestParam("email") String email){
              
         SimpleMailMessage message = new SimpleMailMessage();
             
            message.setFrom("aicteactivity4@gmail.com");
            message.setTo(email);
            message.setSubject("NewsLetter subscription Confirmation");
            message.setText("Dear User,\n\tYou have been now subscribed to our newsletter.\nThank you");
             
            javaMailSender.send(message);
             
            System.out.println("Mail successfully sent..");
            StoreEmail emails=new StoreEmail();
            emails.setEmail(email);
            emailrepository.save(emails);
             
            return "Your Mail sent successfully";
            
            
        }
 
}