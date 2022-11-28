package com.example.myfirstproject;

import com.example.myfirstproject.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public void run(String... args) throws Exception{

	}


}
