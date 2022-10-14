package com.example;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration 
public class AppConfig {
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
}