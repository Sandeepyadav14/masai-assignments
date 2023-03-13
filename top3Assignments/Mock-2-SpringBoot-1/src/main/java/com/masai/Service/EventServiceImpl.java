package com.masai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.EventException;
import com.masai.Module.Event;
import com.masai.Repository.EventRepo;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventRepo eRepo;

	@Override
	public Event addEvent(Event event) throws EventException {
		
		if(event!=null) {
			event = eRepo.save(event);
			
			return event;
		}
		else throw new EventException("Event Can't be null....");
		
	}

	@Override
	public Event updateEvent(Integer id, Event event) throws EventException {
		
	           Event event1 = eRepo.findById(id)
	        		              .orElseThrow(() -> new EventException("No event Found.."));
	           
	           event.setId(id);
	           
	           event1 = eRepo.save(event);
	           
	           return event1;
		
	}

	@Override
	public Event deleteEvent(Integer id) throws EventException {
		
		 Event event1 = eRepo.findById(id)
	              .orElseThrow(() -> new EventException("No event Found.."));
		
		 eRepo.delete(event1);
		 
		 return event1;
		
	}

}
