package com.pfizer.model;


public class Patient extends Employee{

	private String patientId;
	
	private String pps;
	
	private boolean decease;
	
	private String medHistory;
	
	private Insurance insurance;
	
	private PayAccount payAccount;
	

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPps() {
		return pps;
	}

	public void setPps(String pps) {
		this.pps = pps;
	}

	public boolean isDecease() {
		return decease;
	}

	public void setDecease(boolean decease) {
		this.decease = decease;
	}

	public String getMedHistory() {
		return medHistory;
	}

	public void setMedHistory(String medHistory) {
		this.medHistory = medHistory;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public PayAccount getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(PayAccount payAccount) {
		this.payAccount = payAccount;
	}
	
	public String toString(){
		return getPatientId()+getEmpId()+getFirstName()+getLastName()+getMedHistory();
	}

	

	
}
