package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
//		SpringApplication.run(DemoApplication.class, args);

		try {
			throw new NullPointerException("dd");
		}
//		catch(Exception e) {
		catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
