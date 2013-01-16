package com.pfizer.model;

import java.util.Date;

public class PatientInfo {

	private long patientId;
	private String patientFirstName;
	private String patientLastName;
	private String address1;
	private String address2;
	private String address3;
	private String townCity;
	private String county;
	private String country;
	private String pps;
	private String medInsurance;
	private String medOther;
	private String insurancePolicy;
	private String insurancePlan;
	private int patientPhone;
	private Date dateOfBirth;
	private String guardianFirstName;
	private String guardianLastName;
	private int guardianPhone;
	private String medHistory;
	private boolean decease;
	
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getPatientFirstName() {
		return patientFirstName;
	}
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getTownCity() {
		return townCity;
	}
	public void setTownCity(String townCity) {
		this.townCity = townCity;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPps() {
		return pps;
	}
	public void setPps(String pps) {
		this.pps = pps;
	}
	
	
	public String getMedInsurance() {
		return medInsurance;
	}
	public void setMedInsurance(String medInsurance) {
		this.medInsurance = medInsurance;
	}
	
	public String getMedOther() {
		return medOther;
	}
	public void setMedOther(String medOther) {
		this.medOther = medOther;
	}
	
	
	public String getInsurancePolicy() {
		return insurancePolicy;
	}
	public void setInsurancePolicy(String insurancePolicy) {
		this.insurancePolicy = insurancePolicy;
	}
	public String getInsurancePlan() {
		return insurancePlan;
	}
	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
	public int getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(int patientPhone) {
		this.patientPhone = patientPhone;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGuardianFirstName() {
		return guardianFirstName;
	}
	public void setGuardianFirstName(String guardianFirstName) {
		this.guardianFirstName = guardianFirstName;
	}
	public String getGuardianLastName() {
		return guardianLastName;
	}
	public void setGuardianLastName(String guardianLastName) {
		this.guardianLastName = guardianLastName;
	}
	public int getGuardianPhone() {
		return guardianPhone;
	}
	public void setGuardianPhone(int guardianPhone) {
		this.guardianPhone = guardianPhone;
	}
	public String getMedHistory() {
		return medHistory;
	}
	public void setMedHistory(String medHistory) {
		this.medHistory = medHistory;
	}
	public boolean isDecease() {
		return decease;
	}
	public void setDecease(boolean decease) {
		this.decease = decease;
	}
	
	
	
}
