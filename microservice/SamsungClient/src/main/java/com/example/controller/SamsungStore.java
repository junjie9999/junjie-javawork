package com.example.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Device;
import com.example.model.Devices;


@RestController
@RequestMapping("/samsung")
public class SamsungStore {

	@RequestMapping("/devices")
    public Devices getDevices()
    {
        List<Device> devices=new ArrayList<>();
        devices.add(new Device("Samsung Hasan","Smart Phone with touch screen"));
        devices.add(new Device("Hasan Note","Best device as personal PDA"));        
        Devices list=new Devices("samsung",devices);
        return list;
    }
}
