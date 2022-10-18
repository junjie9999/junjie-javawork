package com.example.laptopinterface;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.example.HDDInterfaces.Storages;
	@Component("Apple") 

	public class Apple  implements Storages {
		@Autowired
		@Qualifier("GB")
		Storages SSD;
		public String spec() {
			System.out.println("this  has " +SSD.spec()+"Storage");
			return SSD.spec();
		}


}
