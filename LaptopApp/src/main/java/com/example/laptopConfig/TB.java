package com.example.laptopConfig;

import org.springframework.stereotype.Component;

import com.example.HDDInterfaces.Storages;

@Component("TB")
public class TB implements Storages {
		public String spec() {
			return "1TB";
}
}		
