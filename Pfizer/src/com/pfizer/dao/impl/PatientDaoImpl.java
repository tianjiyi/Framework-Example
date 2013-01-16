package com.pfizer.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.pfizer.dao.PatientDao;
import com.pfizer.model.PatientInfo;
import com.pfizer.model.Patient;

public class PatientDaoImpl extends HibernateDaoSupport implements PatientDao{

	public void savePatient(PatientInfo patientInfo){
		getHibernateTemplate().save(patientInfo);
		
	}
	
	public void savePatient(Patient patient){
		getHibernateTemplate().save(patient);
	}
	
	public void updatePatient(PatientInfo patientInfo){
		getHibernateTemplate().update(patientInfo);
	}
	
	public List<PatientInfo> getPatientInfo(){
		 
		return getHibernateTemplate().find("from PatientInfo");
	}
	public List<Patient> getPatientList(){
		return getHibernateTemplate().find("from Patient");
	}
	 
	public boolean isPatient(PatientInfo patientInfo) {
		Long patientId = new Long(patientInfo.getPatientId());
		List validPatient = this.getHibernateTemplate().findByNamedParam(
				"from PatientInfo " + "where patientId = :patientId "
						+ "and patientLastName = :patientLastName",
				new String[] { "patientId", "patientLastName" },
				new Object[] { patientInfo.getPatientId(),
						patientInfo.getPatientLastName() });
		if (validPatient.isEmpty()) {
		
			return false;
		}
		return true;
	}
	
	public boolean isPatient(Patient patient) {
		System.out.println(patient.getPatientId()+patient.getLastName());
		String patientId = patient.getPatientId();
		List validPatient = this.getHibernateTemplate().findByNamedParam(
				"from Employee e1,Patient p1 " + "where p1.patientId = :patientId "
						+ "and e1.lastName = :lastName",
				new String[] { "patientId", "lastName" },
				new Object[] { patient.getPatientId(),
						patient.getLastName() });
		System.out.println(validPatient.toString());
		if (validPatient.isEmpty()) {
			return false;
		}
		System.out.println("true");
		return true;
	}

	
}
