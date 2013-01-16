package com.pfizer.model;

import java.util.Date;

import javax.annotation.PostConstruct;

public class Appointment {
	private String appointmentId;
	
	private Date startDate;
	
	private Date endDate;
	
	private String title;
	
	private Doctor doctor;
	
	private Patient patient;
	
	@PostConstruct
	public void init(){
		if(doctor==null){
			doctor=new Doctor();
		}
		if(patient==null){
			patient=new Patient();
		}
	}
	
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString(){
		return appointmentId+startDate+endDate+title;
	}
	
	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
}

