package com.pfizer.dao;

import java.util.List;

import com.pfizer.model.PatientInfo;
import com.pfizer.model.Patient;

public interface PatientDao {

	 void savePatient(PatientInfo patientInfo);
	 
	 void savePatient(Patient patient);
	
	 void updatePatient(PatientInfo patientInfo);
	 
	 List<PatientInfo> getPatientInfo();
	 
	 List<Patient> getPatientList();
	 
	 boolean isPatient(PatientInfo patientInfo);
	 
	 boolean isPatient(Patient patient);
}
