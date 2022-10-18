package com.example.Engine;

import org.springframework.stereotype.Component;

import com.example.cars.Engine;

@Component("V8")
public class V8 implements Engine  {
	public String spec() {
		return "V8";	
	}
	
	

}
