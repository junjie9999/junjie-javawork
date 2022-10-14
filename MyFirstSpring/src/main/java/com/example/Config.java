package com.example;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.MyBeans.Book;
import com.example.MyBeans.Person;
import com.example.MyBeans.Product;

@Configuration
public class Config {
	@Bean
	@Scope ("prototype")
	public String greeting() {
		return "hello";
	}
	@Bean
	@Scope ("prototype")
	public LocalTime show() {
		return LocalTime.now();
	}
		@Bean
		@Scope ("prototype")
		public Person showperson() {
			return new Person("jason", 13);
		}
		@Bean
		@Scope ("prototype")
		public Product showProduct() {
			return new Product();
			
	}
		@Bean
		@Scope ("prototype")
		public Book showbook() {
		return new Book(101,"study in scarlet",121,"conan Doyle",5,"Ward Lock & Co");	
}
}