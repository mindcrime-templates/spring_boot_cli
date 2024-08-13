package org.fogbeam.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class MainApplication implements CommandLineRunner
{
	
	@Override
	public void run( String... args ) throws Exception
	{
		System.out.println( "MainApplication" );
	}
	
	public static void main(String[] args) 
	{
		SpringApplication.run(MainApplication.class, args );
	}

}
