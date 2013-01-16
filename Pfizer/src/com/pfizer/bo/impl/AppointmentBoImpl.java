package com.pfizer.bo.impl;

import java.util.List;
import java.util.Map;

import com.pfizer.bo.AppointmentBo;
import com.pfizer.dao.AppointmentDao;
import com.pfizer.model.Appointment;

public class AppointmentBoImpl implements AppointmentBo {
	AppointmentDao appointmentDao;
	
	public void setAppointmentDao(AppointmentDao appointmentDao) {
		this.appointmentDao = appointmentDao;
	}

	@Override
	public void saveEvent(Appointment appm) {
		appointmentDao.saveEvent(appm);
	}
	
	@Override
	public void updateEvent(Appointment appm){
		appointmentDao.updateEvent(appm);
	}

	@Override
	public List<Appointment> getAppointmentList() {
		return appointmentDao.getAppointmentList();
	}
	
	@Override
	public void deleteEvent(Appointment appm){
		appointmentDao.deleteEvent(appm);
	}
	@Override
	public List<Appointment> getAvailableSlotsList(Map<String,Object> searchCriteria){
		return appointmentDao.getAvailableSlotsList(searchCriteria);
	}
	
	
}

