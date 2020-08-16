package edu.fpt.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailController {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@GetMapping(value = "sendEmail")
	public String sendEmail() {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("kinvo5120@gmail.com");
		msg.setText("Hello World \n Spring Boot Email");
		msg.setSubject("TEst Spring eMail");
		javaMailSender.send(msg);
		return "success";
	}

}
