package com.example;

//import java.beans.beancontext.BeanContext;
//import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;

import com.example.MyBeans.Book;

//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class MyFirstSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyFirstSpringApplication.class, args);
		ApplicationContext context = SpringApplication.run(Config.class, args);
	    Object byName = context.getBean("showbook");
	    Book byType = context.getBean(Book.class);
	    Book byBoth = context.getBean("showbook", Book.class);

	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);

}
}
