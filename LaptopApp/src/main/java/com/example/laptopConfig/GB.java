package com.example.laptopConfig;

import org.springframework.stereotype.Component;

import com.example.HDDInterfaces.Storages;

@Component("GB")
public class GB implements Storages {
		public String spec() {
			return "512GB";

}
}
