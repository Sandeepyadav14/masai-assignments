package com.masai.Service;

import com.masai.Exception.EventException;
import com.masai.Module.Event;

public interface EventService {

	public Event addEvent(Event event)throws EventException;
	
	public Event updateEvent(Integer id,Event event)throws EventException;
	
	public Event deleteEvent(Integer id)throws EventException;
   
}