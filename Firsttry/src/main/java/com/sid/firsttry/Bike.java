package com.sid.firsttry;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public void drive() {
		System.out.println("Driving Bike.....");
	}
}
	