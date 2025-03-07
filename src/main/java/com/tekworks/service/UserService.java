package com.tekworks.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	public void displayUserName(String name) {
		log.info("Program enter into ");
	}
	
	public void displayComapnyName(String company) {
		log.info("CompanyName is : {}",company);
	}
	
	public void displayExceptionName(String exception) throws Exception {
		throw new RuntimeException(exception);
	}
}
