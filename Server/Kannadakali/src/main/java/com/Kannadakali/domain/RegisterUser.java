package com.Kannadakali.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amtica.constant.Gender;
import com.amtica.constant.Status;

@Entity
public class RegisterUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long uid;
	public String uname;
	@Enumerated(EnumType.STRING)
	public Gender ugender;
	public String uoriginalplace;
	public String ustayduration;
	public String uoccupation;
	public String uemail;
	public String umobilenumber;
	@Enumerated(EnumType.STRING)
	public Status ustatus;
	public String timestamp;
	public String unsubscribedtimestamp;
	
	public Long getId() {
		return uid;
	}
	public void setId(Long id) {
		this.uid = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Gender getUgender() {
		return ugender;
	}
	public void setUgender(Gender ugender) {
		this.ugender = ugender;
	}
	public String getUoriginalplace() {
		return uoriginalplace;
	}
	public void setUoriginalplace(String uoriginalplace) {
		this.uoriginalplace = uoriginalplace;
	}
	public String getUstayduration() {
		return ustayduration;
	}
	public void setUstayduration(String ustayduration) {
		this.ustayduration = ustayduration;
	}
	public String getUoccupation() {
		return uoccupation;
	}
	public void setUoccupation(String uoccupation) {
		this.uoccupation = uoccupation;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobilenumber() {
		return umobilenumber;
	}
	public void setUmobilenumber(String umobilenumber) {
		this.umobilenumber = umobilenumber;
	}
	public Status getUstatus() {
		return ustatus;
	}
	public void setUstatus(Status ustatus) {
		this.ustatus = ustatus;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getUnsubscribedtimestamp() {
		return unsubscribedtimestamp;
	}
	public void setUnsubscribedtimestamp(String unsubscribedtimestamp) {
		this.unsubscribedtimestamp = unsubscribedtimestamp;
	}
	
	
}
