package com.pfizer.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.pfizer.bo.AppointmentBo;
import com.pfizer.model.Appointment;
import com.pfizer.model.Doctor;

import java.io.Serializable;
import java.util.*;

@ManagedBean
public class SearchBean implements Serializable {

	@ManagedProperty(value = "#{appointmentBo}")
	private AppointmentBo appointmentBo;

	private Date startDate;

	private Date endDate;

	private Doctor doctor;

	private Map<String,Object> searchCriteria;
	
	private boolean render;
	
	public String setRenderTrue(){
		render=true;
		return "success";
	}

	public boolean isRender() {
		return render;
	}

	public void setRender(boolean render) {
		this.render = render;
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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public AppointmentBo getAppointmentBo() {
		return appointmentBo;
	}

	public void setAppointmentBo(AppointmentBo appointmentBo) {
		this.appointmentBo = appointmentBo;
	}
	

	public Map<String, Object> getSearchCriteria() {
		return searchCriteria;
	}

	public void setSearchCriteria(Map<String, Object> searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public List<Appointment> getAvailableSlotsList(){
		searchCriteria=new HashMap<String,Object>();
		return appointmentBo.getAvailableSlotsList(searchCriteria);
				
	}

}
