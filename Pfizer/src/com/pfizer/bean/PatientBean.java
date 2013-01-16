package com.pfizer.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import com.pfizer.bo.PatientBo;
import com.pfizer.model.PatientInfo;
import com.pfizer.model.User;
@ManagedBean
@ViewScoped
public class PatientBean implements Serializable{
	@ManagedProperty(value="#{patientBo}")
	PatientBo patientBo;
	
	public PatientBo getPatientBo() {
		return patientBo;
	}
	public void setPatientBo(PatientBo patientBo) {
		this.patientBo = patientBo;
	}
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
	private PatientInfo patient;
	
	
	
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
	
	public String savePatient(){
		//if(patient==null){
		patient = new PatientInfo();
		//}
		patient.setPatientId(getPatientId());
		patient.setPatientFirstName(getPatientFirstName());
		patient.setPatientLastName(getPatientLastName());
		patient.setAddress1(getAddress1());
		patient.setAddress2(getAddress2());
		patient.setAddress3(getAddress3());
		patient.setTownCity(getTownCity());
		patient.setCounty(getCounty());
		patient.setCountry(getCountry());
		patient.setPps(getPps());
		patient.setMedInsurance(getMedInsurance());
		patient.setMedOther(getMedOther());
		patient.setInsurancePolicy(getInsurancePolicy());
		patient.setInsurancePlan(getInsurancePlan());
		patient.setPatientPhone(getPatientPhone());
		patient.setDateOfBirth(getDateOfBirth());
		patient.setGuardianFirstName(getGuardianFirstName());
		patient.setGuardianLastName(getGuardianLastName());
		patient.setGuardianPhone(getGuardianPhone());
		patient.setMedHistory(getMedHistory());
		patient.setDecease(isDecease());
	
		patientBo.savePatient(patient);
	//	patient=new PatientInfo();
		
		//clearForm();
		
		return "success";
		
	 }
		
	 public String updatePatient(){
		 
		 PatientInfo patientInfo = new PatientInfo();
			
			patientInfo.setPatientId(getPatientId());
			patientInfo.setPatientFirstName(getPatientFirstName());
			patientInfo.setPatientLastName(getPatientLastName());
			patientInfo.setAddress1(getAddress1());
			patientInfo.setAddress2(getAddress2());
			patientInfo.setAddress3(getAddress3());
			patientInfo.setTownCity(getTownCity());
			patientInfo.setCounty(getCounty());
			patientInfo.setCountry(getCountry());
			patientInfo.setPps(getPps());
			patientInfo.setMedInsurance(getMedInsurance());
			patientInfo.setMedOther(getMedOther());
			patientInfo.setInsurancePolicy(getInsurancePolicy());
			patientInfo.setInsurancePlan(getInsurancePlan());
			patientInfo.setPatientPhone(getPatientPhone());
			patientInfo.setDateOfBirth(getDateOfBirth());
			patientInfo.setGuardianFirstName(getGuardianFirstName());
			patientInfo.setGuardianLastName(getGuardianLastName());
			patientInfo.setGuardianPhone(getGuardianPhone());
			patientInfo.setMedHistory(getMedHistory());
			patientInfo.setDecease(isDecease());
		
			patientBo.updatePatient(patientInfo);
			return "success";
		 
	 }
	 
	 
	 public List<PatientInfo> getPatientInfo(){
		 return patientBo.getPatientInfo();
	 }
	 
	 
	 public String isPatient(){
		 
		 patient = new PatientInfo();
		 patient.setPatientId(getPatientId());
		 patient.setPatientLastName(getPatientLastName());
			
			System.out.println("patientId:" + getPatientId());
			
			if (patientBo.isPatient(patient)) {
				List<PatientInfo> pList=getPatientInfo();
				
				for(PatientInfo p:pList){
					if(p.getPatientId()==patientId){
						patient=p;
						break;
					}
				}
				initializePatient(patient.getPatientId());
				return "valid";
			}
			return "invalid";
		}
	 
	 public void initializePatient(long patientId){
		/* List<PatientInfo> patientList = getPatientInfo();
		 PatientInfo patient=new PatientInfo();
		 for(PatientInfo pInfo: patientList){
			 if(pInfo.getPatientId()== patientId){
				 patient=pInfo;
				 System.out.println("Patient Id"+patientId);
				 break;
			 }
		 }*/
		 this.patientId = patient.getPatientId();
		 this.patientFirstName = patient.getPatientFirstName();
		 this.patientLastName = patient.getPatientLastName();
		 this.address1 = patient.getAddress1();
		 this.address2 = patient.getAddress2();
		 this.address3 = patient.getAddress3();
		 this.townCity = patient.getTownCity();
		 this.county = patient.getCounty();
		 this.country = patient.getCountry();
		 this.pps = patient.getPps();
		 this.medInsurance = patient.getMedInsurance();
		 this.medOther = patient.getMedOther();
		 this.insurancePolicy = patient.getInsurancePolicy();
		 this.insurancePlan = patient.getInsurancePlan();
		 this.patientPhone = patient.getPatientPhone();
		 this.dateOfBirth = patient.getDateOfBirth();
		 this.guardianFirstName = patient.getGuardianFirstName();
		 this.guardianLastName = patient.getGuardianLastName();
		 this.guardianPhone = patient.getGuardianPhone();
		 this.medHistory = patient.getMedHistory();
		 this.decease = patient.isDecease();
	 }
	 
	 
	
}
