package com.Kannadakali.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WordOfTheDay {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String mainword;
	public String mainwordphonetics;
	public String mainwordmeaning;
	public String mainwordaudio;
	public String mainwordimageurl;
	public String similarwordone;
	public String similarwordtwo;
	public String timestamp;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMainword() {
		return mainword;
	}
	public void setMainword(String mainword) {
		this.mainword = mainword;
	}
	public String getMainwordphonetics() {
		return mainwordphonetics;
	}
	public void setMainwordphonetics(String mainwordphonetics) {
		this.mainwordphonetics = mainwordphonetics;
	}
	public String getMainwordmeaning() {
		return mainwordmeaning;
	}
	public void setMainwordmeaning(String mainwordmeaning) {
		this.mainwordmeaning = mainwordmeaning;
	}
	public String getMainwordaudio() {
		return mainwordaudio;
	}
	public void setMainwordaudio(String mainwordaudio) {
		this.mainwordaudio = mainwordaudio;
	}
	public String getMainwordimageurl() {
		return mainwordimageurl;
	}
	public void setMainwordimageurl(String mainwordimageurl) {
		this.mainwordimageurl = mainwordimageurl;
	}
	public String getSimilarwordone() {
		return similarwordone;
	}
	public void setSimilarwordone(String similarwordone) {
		this.similarwordone = similarwordone;
	}
	public String getSimilarwordtwo() {
		return similarwordtwo;
	}
	public void setSimilarwordtwo(String similarwordtwo) {
		this.similarwordtwo = similarwordtwo;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
