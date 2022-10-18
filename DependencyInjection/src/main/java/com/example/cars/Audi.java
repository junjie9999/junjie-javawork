package com.example.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.example.Interfaces.Car;
@Component("Audi") 

public class Audi implements Car {
	@Autowired
	@Qualifier("V8")
	Engine eng;
	public String spec() {
		System.out.println("this car has " +eng.spec()+"Engine");
		return eng.spec();
	}

}
