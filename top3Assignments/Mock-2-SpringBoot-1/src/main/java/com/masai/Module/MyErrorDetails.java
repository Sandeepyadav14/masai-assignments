package com.masai.Module;


import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MyErrorDetails {
	
	private LocalDateTime timeStamp;
	private String message;
	private String details;

}