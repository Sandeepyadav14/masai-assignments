package com.masai.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.masai.Exception.EventException;
import com.masai.Exception.UserException;
import com.masai.Module.User;
import com.masai.Repository.EventRepo;
import com.masai.Repository.UserRepo;

import com.masai.Module.Event;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo uRepo;

	@Autowired
	private EventRepo eRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User addUser(User user) throws UserException {

		if (user != null) {
			
			    user.setPassword(passwordEncoder.encode(user.getPassword()));
			
			uRepo.save(user);
			return user;
		} else
			throw new UserException("user can't be null....");

	}

	@Override
	public User updateUser(User user, String email) throws UserException {

		User user1 = uRepo.findById(email).orElseThrow(() -> new UserException("user not found.."));

		user.setEmail(email);

		user1 = uRepo.save(user);

		return user1;

	}

	@Override
	public User deleteUser(String email) throws UserException {

		User user = uRepo.findById(email).orElseThrow(() -> new UserException("user not found.."));

		uRepo.delete(user);

		return user;

	}

	@Override
	public User getUserById(String email) throws UserException {

		User user = uRepo.findById(email).orElseThrow(() -> new UserException("user not found.."));

		return user;

	}

	@Override
	public List<Event> getEventByType(String email,String type) throws EventException,UserException {

		List<Event> events = null;
		
		User user = uRepo.findById(email).orElseThrow(() -> new UserException("user not found.."));
		
		List<Event> eve = user.getEvents();

		if (type.equalsIgnoreCase("Month")) {

			LocalDate now = LocalDate.now();

			LocalDate month = now.plusMonths(1);

			List<Integer> ids = eRepo.getEventByDate(now, month);
			
			for(Integer i:ids) {
				for(Event e:eve) {
					if(e.getId()==i) {
						events.add(e);
					}
				}
			}

		} else if (type.equalsIgnoreCase("Week")) {

			LocalDate now = LocalDate.now();

			LocalDate week = now.plusWeeks(1);

			List<Integer> ids = eRepo.getEventByDate(now, week);
			
			for(Integer i:ids) {
				for(Event e:eve) {
					if(e.getId()==i) {
						events.add(e);
					}
				}
			}
		}
		else if(type.equalsIgnoreCase("day")){
			
			LocalDate now = LocalDate.now();
			
			List<Integer> ids = eRepo.getEventByDate(now, now);
			
			for(Integer i:ids) {
				for(Event e:eve) {
					if(e.getId()==i) {
						events.add(e);
					}
				}
			}
			
		}
		else {
			
			throw new EventException("Please Enter right event type(month,week,day)...");
			
		}
		
		if(events.size()==0) {
			throw new EventException("No events found..");
		}
		
		return events;

	}

	@Override
	public String loginUser(String email, String password) throws UserException {
		
		User user = uRepo.findById(email).orElseThrow(() -> new UserException("user not found.."));

		return "Welcome "+user.getFirstName();
		
	}

}