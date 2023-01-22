package com.masai.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Bean.Email;

public interface EmailRepo extends JpaRepository<Email, Integer>{

}
