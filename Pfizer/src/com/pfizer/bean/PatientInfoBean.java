package com.pfizer.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import java.io.*;

import com.pfizer.model.Insurance;
import com.pfizer.model.Patient;
import com.pfizer.model.PatientU18;
import com.pfizer.model.PayAccount;
import com.pfizer.bo.PatientBo;


@ManagedBean
@SessionScoped
public class PatientInfoBean implements Serializable {
	@ManagedProperty(value="#{patientBo}")
	PatientBo patientBo;
	
	@ManagedProperty(value="#{patient}")
	private Patient patient;
	
	@PostConstruct
	public void init(){
		System.out.println("I am new Bean!!!");
		
		if(patient.getInsurance()==null){
			patient.setInsurance(new Insurance());
		}
		if(patient.getPayAccount()==null){
			patient.setPayAccount(new PayAccount());
		}
	}
	
	public PatientBo getPatientBo() {
		return patientBo;
	}

	public void setPatientBo(PatientBo patientBo) {
		this.patientBo = patientBo;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	

	// Patient method
	public List<Patient> getPatientList(){
		 return patientBo.getPatientList();
	 }
	
	public String isPatient(){
		 
			if (patientBo.isPatient(patient)) {
				List<Patient> pList=getPatientList();
				
				for(Patient p:pList){
					if(p.getPatientId().equals(patient.getPatientId())){
						patient=p;
						System.out.println(patient.toString());
						break;
					}
				}
				System.out.println("valid");
				return "valid";
			}
			return "invalid";
		}
	
	public String savePatient(){
		patientBo.savePatient(patient);
		return "success";
	}
	

}
