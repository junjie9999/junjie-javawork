package MapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Collection.Product;

public class MapTest {
	
	public static void main(String[] args) {
		Map<Integer, String> myMap=new HashMap();
		myMap.put(1234,"London");
		myMap.put(12345, "new-york");
		myMap.put(12345, "new-york");
		for(Map.Entry m:myMap.entrySet()) 
		{
			System.out.println(m.getKey()+"----"+m.getValue());
		}
		Map<Integer,Product> proMap=new HashMap();
		List<Product> prodList=new ArrayList<Product>();
        Product prod1=new Product("Bluetooth",50,10,"Boat");        
        Product prod2=new Product("TV",1000,5,"Apple");        
        Product prod3=new Product("Camera",500,8,"Sony");        
        Product prod4=new Product("Tripod",70,15,"Digitech");
        Product prod5=new Product("Camera",500,8,"Sony");        
        Product prod6=new Product("Tripod",70,15,"Digitech");
        proMap.put(1,prod1);
        proMap.put(2,prod2);
        proMap.put(3,prod3);
        proMap.put(4,prod4);
        proMap.put(5,prod5);
        proMap.put(6,prod6);
		for(Map.Entry m:proMap.entrySet()) 
		{
			System.out.println(m.getKey()+"----"+m.getValue());
		}
	}

}
