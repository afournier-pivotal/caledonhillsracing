package com.caledonhillsracing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CyclistBioApplication 
{

//	@Autowired
//	private DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(CyclistBioApplication.class, args);
	}

}
