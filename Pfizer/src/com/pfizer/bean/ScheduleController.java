package com.pfizer.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.io.*;

import org.primefaces.event.DateSelectEvent;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.ScheduleEntrySelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import org.primefaces.model.LazyScheduleModel;
import java.util.*;

import com.pfizer.bo.AppointmentBo;
import com.pfizer.model.Appointment;
import com.pfizer.helper.PfizerScheduleModel;


@ManagedBean
@ViewScoped
public class ScheduleController implements Serializable {

	@ManagedProperty(value = "#{appointmentBo}")
	private AppointmentBo appointmentBo;
	
	//binding Event with Appointment
	private Map<String,Appointment> evtAppList=new HashMap<String,Appointment>();
	//declare appointment
	private Appointment app =new Appointment();
	
	public Appointment getApp() {
		return app;
	}
	public void setApp(Appointment app) {
		this.app = app;
	}

	private Date eventStartDate;
	private Date eventEndDate;
	public Date getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(Date eventStartDate) {
		Calendar calendar=Calendar.getInstance();
		Date startDate=eventStartDate;
		calendar.setTime(startDate);
		calendar.add(Calendar.HOUR, -1);
		this.eventStartDate = calendar.getTime();
		((DefaultScheduleEvent)event).setStartDate(this.eventStartDate);
	}
	
	public void setAppointmentBo(AppointmentBo appointmentBo) {
		this.appointmentBo = appointmentBo;
	}

	private ScheduleModel eventModel;

	public ScheduleModel getEventModel() {
		return eventModel;
	}

	public void setEventModel(ScheduleModel eventModel) {
		this.eventModel = eventModel;
	}

	public ScheduleModel getLazyEventModel() {
		return lazyEventModel;
	}

	public void setLazyEventModel(ScheduleModel lazyEventModel) {
		this.lazyEventModel = lazyEventModel;
	}

	public ScheduleEvent getEvent() {
		return event;
	}

	public void setEvent(ScheduleEvent event) {
		this.event = event;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	private ScheduleModel lazyEventModel;

	private ScheduleEvent event=new DefaultScheduleEvent();

	private String theme;

	
	public ScheduleController() {
		eventModel = new DefaultScheduleModel();

		lazyEventModel = new PfizerScheduleModel() {
			@Override
			public void loadEvents(Date start, Date end) {
				List<Appointment> appList=appointmentBo.getAppointmentList();
				for(Appointment app:appList){
					ScheduleEvent event=new DefaultScheduleEvent(app.getTitle(),app.getStartDate(),app.getEndDate());
					event.setId(app.getAppointmentId());
					addEvent(event,app);
				}
			}
			
			@Override
			public void addEvent(ScheduleEvent event,Appointment app){
				Calendar calNew=Calendar.getInstance();
				Calendar calEnd=Calendar.getInstance();
				calNew.setTime(event.getStartDate());calEnd.setTime(event.getEndDate());
				calNew.add(Calendar.HOUR, 1);calEnd.add(Calendar.HOUR, 1);
				((DefaultScheduleEvent)event).setStartDate(calNew.getTime());
				((DefaultScheduleEvent)event).setEndDate(calEnd.getTime());
				//List<ScheduleEvent> events=super.getEvents();
			    //events.add(event);
			 	evtAppList.put(event.getId(),app);
				super.addEvent(event);
			}
		};
	}

	public ScheduleModel getLazyModel() {
		return lazyEventModel;
	}
	
	public void removeEvent(ActionEvent actionEvent){
		if(event.getId()!=null){
			app=evtAppList.get(event.getId());
			lazyEventModel.deleteEvent(event);
			appointmentBo.deleteEvent(app);
		}
	}

	public void addEvent(ActionEvent actionEvent) {
		//initialize Appointment Object
		Appointment app = new Appointment();	
		if (event.getId() == null) {
			((PfizerScheduleModel)lazyEventModel).addEvent(event,app);	
			app.setAppointmentId(event.getId());
			app.setStartDate(getEventStartDate());
			app.setEndDate(getEventEndDate());
			app.setTitle(event.getTitle());	
			System.out.println(app.toString());
			System.out.println("afterAdded eventID:"+event.getId()+"Start:"+event.getStartDate()+"End"+event.getEndDate());
			appointmentBo.saveEvent(app);
			System.out.println("onSaved:"+"Start:"+getEventStartDate()+"End"+getEventEndDate());
		} else{
			lazyEventModel.updateEvent(event);
		}
		event = new DefaultScheduleEvent();
	}

	public void onEventSelect(ScheduleEntrySelectEvent selectEvent) {
		event = selectEvent.getScheduleEvent();
	//	setEventStartDate(event.getStartDate());
	//	setEventEndDate(event.getEndDate());
		app=evtAppList.get(event.getId());
		((DefaultScheduleEvent)event).setStartDate(app.getStartDate());
		((DefaultScheduleEvent)event).setEndDate(app.getEndDate());
		System.out.println("onEventSelected eventID:"+event.getId()+"Start:"+app.getStartDate()+"End"+app.getEndDate());
	}

	public void onDateSelect(DateSelectEvent selectEvent) {
		 
		setEventStartDate(selectEvent.getDate());
		setEventEndDate(selectEvent.getDate());
		event = new DefaultScheduleEvent("", getEventStartDate(),getEventEndDate());
		System.out.println("onSelected eventID:"+event.getId()+"Start:"+event.getStartDate()+"End"+event.getEndDate());
	}

	public Date getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(Date eventEndDate) {
		Calendar calendar=Calendar.getInstance();
		Date endDate=eventEndDate;
		calendar.setTime(endDate);
	//	calendar.add(Calendar.HOUR, 1);
		this.eventEndDate = calendar.getTime();
		((DefaultScheduleEvent)event).setEndDate(this.eventEndDate);
	}

	public void onEventMove(ScheduleEntryMoveEvent moveEvent) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Event moved", "Day delta:" + moveEvent.getDayDelta()
						+ ", Minute delta:" + moveEvent.getMinuteDelta());
		
		event=moveEvent.getScheduleEvent();
		//((DefaultScheduleEvent)event).setStartDate(setOneHourBack(event.getStartDate()));
		//((DefaultScheduleEvent)event).setEndDate(setOneHourBack(event.getEndDate()));
		app=evtAppList.get(event.getId());
		app.setStartDate(setOneHourBack(event.getStartDate()));
		app.setEndDate(setOneHourBack(event.getEndDate()));
		System.out.println("onMoved eventID:"+event.getId()+"Start:"+event.getStartDate()+"End"+event.getEndDate());
		addMessage(message);
		appointmentBo.updateEvent(app);
	}

	public void onEventResize(ScheduleEntryResizeEvent resizeEvent) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Event resized", "Day delta:" + resizeEvent.getDayDelta()
						+ ", Minute delta:" + resizeEvent.getMinuteDelta());
		event=resizeEvent.getScheduleEvent();
		//((DefaultScheduleEvent)event).setStartDate(setOneHourBack(event.getStartDate()));
		//((DefaultScheduleEvent)event).setEndDate(setOneHourBack(event.getEndDate()));
		app=evtAppList.get(event.getId());
		app.setStartDate(setOneHourBack(event.getStartDate()));
		app.setEndDate(setOneHourBack(event.getEndDate()));
		System.out.println("onResized eventID:"+event.getId()+"Start:"+event.getStartDate()+"End"+event.getEndDate());
		addMessage(message);
		appointmentBo.updateEvent(app);
	}

	private void addMessage(FacesMessage message) {
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	private Date setOneHourBack(Date date){
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);calendar.add(Calendar.HOUR, -1);
		return calendar.getTime();
	}
	private Date setOneHourAhead(Date date){
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);calendar.add(Calendar.HOUR, 1);
		return calendar.getTime();
	}

	// Getters and Setters
}