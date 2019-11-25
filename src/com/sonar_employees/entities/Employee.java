package com.sonar_employees.entities;

import java.util.Date;

public class Employee {

	public String Name;
    public String Surname;
    public java.util.Date BirthDate;
    public String address;
    public String Role_type;
    public String departemnt;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public java.util.Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(java.util.Date birthDate) {
		BirthDate = birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole_type() {
		return Role_type;
	}
	public void setRole_type(String role_type) {
		Role_type = role_type;
	}
	public String getDepartemnt() {
		return departemnt;
	}
	public void setDepartemnt(String departemnt) {
		this.departemnt = departemnt;
	}
    
    

}
