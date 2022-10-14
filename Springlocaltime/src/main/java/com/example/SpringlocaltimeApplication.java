package com.example;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringlocaltimeApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringlocaltimeApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringlocaltimeApplication.class, args);
	    Object byName = context.getBean("greeting1");
	    LocalTime byType = context.getBean(LocalTime.class);
	    LocalTime byBoth = context.getBean("greeting1", LocalTime.class);

	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);


	}
    @Bean
    public LocalTime greeting1() 
    {
        return LocalTime.now();
	
    }
}
