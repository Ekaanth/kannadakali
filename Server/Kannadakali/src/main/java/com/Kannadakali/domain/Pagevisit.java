package com.Kannadakali.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pagevisit")
public class Pagevisit  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String ip;
    private String city;
    private String region;
    private String countryName;
    private String continentName;
    private Double latitude;
    private Double longitude;
    private String organisation;
    private String callingCode;
    private String flag;
    private String emojiFlag;
    private String emojiUnicode;
    private String timestamp;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public String getCallingCode() {
		return callingCode;
	}
	public void setCallingCode(String callingCode) {
		this.callingCode = callingCode;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getEmojiFlag() {
		return emojiFlag;
	}
	public void setEmojiFlag(String emojiFlag) {
		this.emojiFlag = emojiFlag;
	}
	public String getEmojiUnicode() {
		return emojiUnicode;
	}
	public void setEmojiUnicode(String emojiUnicode) {
		this.emojiUnicode = emojiUnicode;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
    
    
}

