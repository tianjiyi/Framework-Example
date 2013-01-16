package com.pfizer.bo.impl;

import java.util.List;

import com.pfizer.bo.PatientBo;
import com.pfizer.dao.PatientDao;
import com.pfizer.model.PatientInfo;
import com.pfizer.model.Patient;

public class PatientBoImpl implements PatientBo{

	PatientDao patientDao;
	
	public void setPatientDao(PatientDao patientDao){
		this.patientDao =  patientDao;
	}
	
	 public void savePatient(PatientInfo patientInfo){
		 patientDao.savePatient(patientInfo);
	 }
	 
	 public void savePatient(Patient patient){
		 patientDao.savePatient(patient);
	 }
		
	 public void updatePatient(PatientInfo patientInfo){
		 patientDao.updatePatient(patientInfo);
	 }
	 
	 public List<PatientInfo> getPatientInfo(){
		 return patientDao.getPatientInfo();
	 }
	 
	 public List<Patient> getPatientList(){
		 return patientDao.getPatientList();
	 }
	 
	 public boolean isPatient(PatientInfo patientInfo){
		return patientDao.isPatient(patientInfo);
	 }
	 
	 public boolean isPatient(Patient patient){
			return patientDao.isPatient(patient);
		 }
}
