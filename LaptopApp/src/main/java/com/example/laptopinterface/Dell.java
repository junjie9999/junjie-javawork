package com.example.laptopinterface;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.example.HDDInterfaces.Storages;
@Component("Dell") 
public class Dell implements Storages {
		@Autowired
		@Qualifier("TB")
		Storages SSD;
		public String spec() {
			System.out.println("this has " +SSD.spec()+"Storage");
			return SSD.spec();
		}


}
