package com.arana.jesus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Controller.StudentController;
import Dao.StudentDao;
import Service.StudentService;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Main.class, args);

	}

	@Bean
	public StudentController studentController(){
		return new StudentController();
	}
	
	@Bean
	public StudentService studentService(){
		return new StudentService();
	}
	
	@Bean
	public StudentDao studentDao(){
		return new StudentDao();
	}
}
