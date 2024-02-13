package com.eazybytes.eazyschool.model;

public class Contact {

	private String Name;
	private String mobileNum;
	private String email;
	private String subject;
	private String message;
	
	public Contact(String name, String mobileNum, String email, String subject, String message) {
		super();
		Name = name;
		this.mobileNum = mobileNum;
		this.email = email;
		this.subject = subject;
		this.message = message;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Contact [Name=" + Name + ", mobileNum=" + mobileNum + ", email=" + email + ", subject=" + subject
				+ ", message=" + message + "]";
	}
	
	
	
}
