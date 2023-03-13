package com.masai.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.Module.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer>{
	  
	 @Query("Select id from Event where startDate>=?1 and endDate<=?2")
	 public List<Integer> getEventByDate(LocalDate start,LocalDate end);

}