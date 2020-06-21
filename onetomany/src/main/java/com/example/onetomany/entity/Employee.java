package com.example.onetomany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private Integer id;
	private String firstName;
	private String name;
	@OneToMany(mappedBy="employee",cascade=CascadeType.ALL)
	List<MobileNumber> mobileNumberList = new ArrayList<MobileNumber>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public List<MobileNumber> getMobileNumberList() {
		return mobileNumberList;
	}
	public void setMobileNumberList(List<MobileNumber> mobileNumberList) {
		this.mobileNumberList = mobileNumberList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
