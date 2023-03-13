package com.masai.module;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CurrentUserSession {
	@Id
	@Column(unique = true)
	private Integer id;
	private String uuid;
	private LocalDateTime localDateTime;
	private String role;
	

}
