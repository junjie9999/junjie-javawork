package com.example;

import org.springframework.boot.SpringApplication;
import com.example.cars.Audi;
import com.example.cars.Porsche;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Interfaces.Car;
//import com.example.Interfaces.specsType;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DependencyInjectionApplication.class, args);
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		Car car1=context.getBean("Audi",Car.class);
		Car car2=context.getBean("Porsche",Car.class);
		
		car1.spec();
		car2.spec();
		
	}

}
