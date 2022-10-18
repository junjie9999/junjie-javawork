package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.HDDInterfaces.Storages;



@SpringBootApplication
public class LaptopApplication {

	public static void main(String[] args) {
			//SpringApplication.run(DependencyInjectionApplication.class, args);
			ApplicationContext context = SpringApplication.run(LaptopApplication.class, args);
			Storages laptop1=context.getBean("Apple",Storages.class);
			Storages laptop2=context.getBean("Dell",Storages.class); 
			
			laptop1.spec();
			laptop2.spec();
			
	}

}
