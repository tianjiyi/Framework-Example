package com.pfizer.bo;

import java.util.List;

import com.pfizer.model.PatientInfo;
import com.pfizer.model.Patient;

public interface PatientBo {

	 void savePatient(PatientInfo patientInfo);
	 
	 //for new
	 void savePatient(Patient patient);
		
	 void updatePatient(PatientInfo patientInfo);
	 
	 List<PatientInfo> getPatientInfo();
	 //for new
	 List<Patient> getPatientList();
	 
	 boolean isPatient(PatientInfo patientInfo);
	 //for new
	 boolean isPatient(Patient patient);
}
