package com.pfizer.helper;

import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleEvent;
import com.pfizer.model.Appointment;
import java.io.*;
public abstract class PfizerScheduleModel extends LazyScheduleModel implements Serializable{
	public abstract void addEvent(ScheduleEvent event,Appointment app);

}
