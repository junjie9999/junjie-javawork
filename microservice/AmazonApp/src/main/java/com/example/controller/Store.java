package com.example.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.example.model.Device;
import com.example.model.Devices;

@Controller
public class Store {
	private Devices listOfDevices;
    @RequestMapping("/")
    public String home(){
		return "home";

    }
    @RequestMapping("/samsung")
    public ModelAndView samsung()
    {
        ModelAndView mv=new ModelAndView("samsung");
        RestTemplate rt=new RestTemplate();
        listOfDevices=rt.getForObject("http://localhost:8084/samsung/devices", Devices.class);
        mv.addObject("devices",listOfDevices);
        return mv;
    
    }
    @RequestMapping("/apple")
    public ModelAndView apple() {
    	ModelAndView mv=new ModelAndView("apple");
    	RestTemplate rt=new RestTemplate();
        return mv;
    
    }
    @RequestMapping("/samsung1")
    public ModelAndView samsung1()
    {
        ModelAndView mv=new ModelAndView("samsung");
        List<Device> samsungList= new ArrayList<>();
        samsungList.add(new Device("Galaxy","smart phone"));
        samsungList.add(new Device("Note","smart tablet"));
        Devices listOfDevices=new Devices("Samsung",samsungList);
        String name="upasana";
        mv.addObject("devices",listOfDevices);
        mv.addObject("myname",name);
        return mv;
    }
    @RequestMapping("/apple1")
    public ModelAndView apple1()
    {
        ModelAndView mv=new ModelAndView("apple");
        List<Device> appleList= new ArrayList<>();
        appleList.add(new Device("13","smart phone"));
        appleList.add(new Device("pro","smart tablet"));
        Devices listOfDevices=new Devices("apple",appleList);
        String name="upasana";
        mv.addObject("devices",listOfDevices);
        mv.addObject("myname",name);
        return mv;
    }
    }
    


