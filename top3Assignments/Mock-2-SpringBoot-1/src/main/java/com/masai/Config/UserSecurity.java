package com.masai.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class UserSecurity {
	
		@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http)throws Exception{
		
		http.authorizeHttpRequests(
				(auth) -> auth.antMatchers().authenticated()
				              .antMatchers("/home").permitAll()
				          
				).csrf().disable()
		         .httpBasic();
		         
		 return http.build();        
	}   
		@Bean
		public PasswordEncoder encodePassword() {
			return new BCryptPasswordEncoder();
		}
		


}