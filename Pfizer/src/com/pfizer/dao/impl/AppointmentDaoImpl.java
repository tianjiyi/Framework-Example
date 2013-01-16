package com.pfizer.dao.impl;

import java.util.*;

import com.pfizer.dao.AppointmentDao;
import com.pfizer.model.Appointment;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class AppointmentDaoImpl extends HibernateDaoSupport implements AppointmentDao{

	@Override
	public void saveEvent(Appointment appm) {
		getHibernateTemplate().save(appm);
	}

	@Override
	public List<Appointment> getAppointmentList() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Appointment");
	}
	

	@Override
	public void updateEvent(Appointment appm) {
		getHibernateTemplate().update(appm);
	}
	
	@Override
	public void deleteEvent(Appointment appm){
		getHibernateTemplate().delete(appm);
	}
	
	@Override
	public List<Appointment> getAvailableSlotsList(Map<String,Object> searchCriteria){
		return getHibernateTemplate().find("from Appointment");
	}
	
	

}
