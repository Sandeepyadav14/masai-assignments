package com.masai.Module;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Event {
	   
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
       private Integer id;
       private LocalDate startDate;
       private LocalDate endDate;
       private String title;
       
       @JsonIgnore
       @ManyToOne
       private User user;
}