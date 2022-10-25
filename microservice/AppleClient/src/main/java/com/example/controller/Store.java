package com.example.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Device;
import com.example.model.Devices;


@Controller
@RequestMapping("/apple")
public class Store {
	@RequestMapping("/devices")
    public Devices getDevices()
    {
        List<Device> devices=new ArrayList<>();
        devices.add(new Device("Iphone13","Just a smart phone with a good camera and very pricy"));
        devices.add(new Device("ipod","Best device to play music"));        
        Devices list=new Devices("Apple",devices);
        return list;
    }
}
