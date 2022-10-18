package com.example.Engine;

import org.springframework.stereotype.Component;

import com.example.cars.Engine;

@Component("S6")
public class S6 implements Engine {
	public String spec() {
		return "straight 6";
		
	}
	

}
