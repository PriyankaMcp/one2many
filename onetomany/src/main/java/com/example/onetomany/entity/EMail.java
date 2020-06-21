package com.example.onetomany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class EMail {
@Id
private int id;
private String mailId;
private String password;
@ManyToOne(cascade=CascadeType.ALL)
private Person person;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}


}
