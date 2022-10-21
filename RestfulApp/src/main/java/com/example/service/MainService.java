package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class MainService {
	List<String> list=new ArrayList<>();
	public MainService() 
	{
		
		list.add("NewYork");
		list.add("London");
		list.add("LA");
		list.add("Washington");
		list.add("Tokyo");
	}
	public List<String> show(){
		return list;
	}

	public List<String> create()
	{
		list.add("Istanbul");
		list.add("Dubai");
		return list;
	}
	//update the list
	public void update( int id)
	{
		list.set(id,"Texas");
	}
	//delete
	public void delete( int id)
	{
		list.remove(id);
	
	}

	}


