package com.example.main;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.account.Account;
import com.example.services.AccountService;


@RestController // responsible for routing user request to expose data
public class MainController {// simple java class
	
	@Autowired
	AccountService accService;
	
	//GET method
		@GetMapping("/acclist")
		public List<Account> accShowList()
		{
			return this.accService.show();
		}
		//POST add to the list
		@PostMapping("/accAdd")
		public List<Account> accAddToList()
		{
			return this.accService.create();
		}
		//PUT update the list
		@PutMapping("/accUpdate/{id}")// http://localhost:8080/update/4
		public void accUpdateTheList(@PathVariable int id)
		{
			this.accService.update(id);
			
		}
		//DELETE deletes a record
		@DeleteMapping("/accDelete/{id}")
		public void accDeleteFromTheList(@PathVariable int id)
		{
			this.accService.delete(id);
			
		}}
