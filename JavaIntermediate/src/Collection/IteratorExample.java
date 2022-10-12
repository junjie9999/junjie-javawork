package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(4);
		list.add("Zaku");
		list.add("GM");
		list.add("Jegan");
		list.add("Jeta");
		System.out.println(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		List<Product> prodList=new ArrayList<Product>();
        Product prod1=new Product("Bluetooth",50,10,"Boat");        
        Product prod2=new Product("TV",1000,5,"Apple");        
        Product prod3=new Product("Camera",500,8,"Sony");        
        Product prod4=new Product("Tripod",70,15,"Digitech");
        Product prod5=new Product("Camera",500,8,"Sony");        
        Product prod6=new Product("Tripod",70,15,"Digitech");
        prodList.add(prod1);
        prodList.add(prod2);
        prodList.add(prod3);
        prodList.add(prod4);
        prodList.add(prod5);
        prodList.add(prod6);
        Iterator<Product> prodItr=prodList.iterator();
        while(prodItr.hasNext())
        {
            System.out.println(prodItr.next());
            
            //System.out.println(prodItr.next().name+"--"+prodItr.next().price+"--"+prodItr.next().brand+"--"+prodItr.next().quantity);            
        }
	}

}
