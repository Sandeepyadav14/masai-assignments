package com.masai.Bean;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Email {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer mail_id;

private String email;
private Date created_date;

@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "email")
private User user;



public Email(Integer mail_id, String email, Date created_date, User user) {
	super();
	this.mail_id = mail_id;
	this.email = email;
	this.created_date = created_date;
	this.user = user;
}
public Email() {
	super();
}
public Integer getMail_id() {
	return mail_id;
}
public void setMail_id(Integer mail_id) {
	this.mail_id = mail_id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getCreated_date() {
	return created_date;
}
public void setCreated_date(Date created_date) {
	this.created_date = created_date;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
@Override
public String toString() {
	return "Email [mail_id=" + mail_id + ", email=" + email + ", created_date=" + created_date + "]";
}


}
