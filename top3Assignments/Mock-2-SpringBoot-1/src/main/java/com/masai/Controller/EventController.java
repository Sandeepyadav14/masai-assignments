package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.EventException;
import com.masai.Module.Event;
import com.masai.Service.EventService;

@RestController
@RequestMapping("/masaicalender")
public class EventController {
	
	@Autowired
	private EventService eService;
	
	
	@GetMapping("/home")
	public ResponseEntity<String> homePageHandler() {
		
		
		return new ResponseEntity<String>("Welcome to Masai Calender...",HttpStatus.CREATED);
		
	}
	
	@PostMapping("/event")
	public ResponseEntity<Event> createEventHandler(@RequestBody Event event ) throws EventException{
		
		Event eve = eService.addEvent(event);
		
		return new ResponseEntity<Event>(eve,HttpStatus.OK);
		
	}
	
	@PutMapping("/event/{id}")
	public ResponseEntity<Event> updateEventHandler(@PathVariable("id") Integer id,@RequestBody Event event ) throws EventException{
		
		Event eve = eService.updateEvent(id,event);
		
		return new ResponseEntity<Event>(eve,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/event/{id}")
	public ResponseEntity<Event> deleteEventHandler(@PathVariable("id") Integer id) throws EventException{
		
		Event eve = eService.deleteEvent(id);
		
		return new ResponseEntity<Event>(eve,HttpStatus.OK);
		
	}

}