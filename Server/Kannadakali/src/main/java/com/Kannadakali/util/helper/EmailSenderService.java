package com.Kannadakali.util.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

		private JavaMailSender javaMailSender;
		
		@Autowired
		public EmailSenderService (JavaMailSender javaMailSender)
		{
			this.javaMailSender=javaMailSender;
		}
		
		public void emailConfirmation(String uemailid)throws MailException
		{
			try {
				SimpleMailMessage mail=new SimpleMailMessage();
				mail.setTo(uemailid);
				mail.setSubject("Email Confirmation");
				// add the confirmation templete here
				javaMailSender.send(mail);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void wordOftheDaYEmail(String uemailid)throws MailException
		{
			try {
				SimpleMailMessage mail=new SimpleMailMessage();
				mail.setTo(uemailid);
				mail.setSubject("Email Confirmation");
				// add the confirmation templete here
				javaMailSender.send(mail);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
