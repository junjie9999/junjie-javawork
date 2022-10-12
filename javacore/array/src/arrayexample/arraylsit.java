package arrayexample;

import java.util.ArrayList;

public class arraylsit extends muiltdimension {
	public static void main(String[] args) {
		int[] x=new int[5];
		ArrayList list= new ArrayList();
		list.add("me");
		list.add(12.5);
		list.add(1234);
		list.add(false);
		list.add('y');
		System.out.println(list);
		
		ArrayList<String> names=new ArrayList(4);
		names.add("jack");
		names.add("google");
		names.add("james");
		names.add("firefox");
		names.add("itune");
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(4));
		
	}

}
