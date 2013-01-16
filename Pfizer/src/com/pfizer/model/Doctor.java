package com.pfizer.model;

import java.util.*;

public class Doctor extends Employee {
	
	private String doctorId;
	
	private String specicalist;
	
	private Set<Bill> bills=new HashSet<Bill>();

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getSpecicalist() {
		return specicalist;
	}

	public void setSpecicalist(String specicalist) {
		this.specicalist = specicalist;
	}

	public Set getBills() {
		return bills;
	}

	public void setBills(Set bills) {
		this.bills = bills;
	}

}
