package com.example.services;
import java.util.ArrayList;
import java.util.List;



import com.example.account.Account;
//@Service
public class AccountService {
	static List<Account> list= new ArrayList<>();	
	
	public AccountService()
	{
		list.add(new Account("A101",1,"Upasana"));
		list.add(new Account("A102",2,"Arifi"));
		list.add(new Account("A103",3,"Jigi"));
		list.add(new Account("A104",4,"Hilda"));
		
	}
	public List<Account>  show() {
		return list;
	}
	public List<Account>  create() {
		list.add(new Account("A105",5,"Kevin"));
		list.add(new Account("A106",7,"Hasan"));
		return list;
	}
	public void  update(int id) {
		list.set(id,new Account("A10new",id,"Nathiya") );
	}
	public void  delete(int id) {
		list.remove(id);
	}


}
