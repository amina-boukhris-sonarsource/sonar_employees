package com.sonar_employees.entities;

import java.util.ArrayList;

public class Department {
	
	public String Name;
	public ArrayList<Employee> employees;
	public String PM;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPM() {
		return PM;
	}
	public void setPM(String pM) {
		PM = pM;
	}
	
	public void AddEmployee(Employee E) {
		
	}
}
