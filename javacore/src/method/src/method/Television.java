package method;

public class Television {
	String brand;
	int price;
	int screensize;
	
	public void turnOn() {
		System.out.println("show display");
	}
	public int switchchannel() 
	{
		return 1;	
	}

	public double getdiscount()
	{
		return (price*-10/100);
	}
	public double discountonblackfirday(int dis)
	{
		System.out.println("");
		return(price*dis/100);
		
	//public double dicountWithCityBank(int dis, int cityDiscount)
	//{
	  //      System.out.println("");
	    //    int totalDiscount=dis+cityDiscount;
	      //  return (price*(totalDiscount)/100);
	        
	    }
	}
//}

	
