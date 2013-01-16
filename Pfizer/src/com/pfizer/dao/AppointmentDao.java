package com.pfizer.dao;

import java.util.List;
import java.util.Map;

import com.pfizer.model.Appointment;

public interface AppointmentDao {

	public void saveEvent(Appointment appm);
	
	public void updateEvent(Appointment appm);
	
	public void deleteEvent(Appointment appm);
	
	public List<Appointment> getAppointmentList();
	
	public List<Appointment> getAvailableSlotsList(Map<String,Object> searchCriteria);
	
	
}

