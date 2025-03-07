package com.tekworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.tekworks.service.UserService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringbootAopApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopApplication.class, args);
	}
	
	@Autowired
	private UserService service;

	@Override
	public void run(String... args) throws Exception {
		
		service.displayUserName("Yash");
		service.displayComapnyName("cognizant");
		//service.displayExceptionName("Hello I am Exception");
	}

}
