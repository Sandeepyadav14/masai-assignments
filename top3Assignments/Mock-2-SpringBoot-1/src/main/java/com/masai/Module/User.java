package com.masai.Module;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	
	@Id
	@Email
	private String email;
	
	@Pattern(regexp = "^[a-zA-Z]{3,}", message = "First Name should not contain numbers or special characters")
	private String firstName;
	
	@Pattern(regexp = "^[a-zA-Z]{3,}", message = "Last Name should not contain numbers or special characters")
	private String lastName;
	
	@Pattern(regexp = "^[0-9]{10}", message = "Mobile number must have 10 digits")
	@NotNull(message = "Please enter mobile number")
	private String mobileNumber;
	
	@Past(message ="date of birth can't be in future..")
	private LocalDate dateOfBirth;
	
	 @NotNull
	 @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "Invalid Password pattern. Password must contain 8 to 20 characters at least one digit, lower, upper case and one special character.")
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Event> events = new ArrayList<>();

}