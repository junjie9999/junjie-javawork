package method;

public class testTV {
	public static void main(String[] args) {
		Television tele=new Television();
		tele.brand ="Samsung";
		tele.price=1200;
		tele.screensize=55;
		tele.turnOn();
		int x=tele.switchchannel();
		System.out.println(x);
		System.out.println(tele.switchchannel());
		
		double discount=tele.getdiscount();
		System.out.println(discount);
		
		double discountonBF=tele.discountonblackfirday(60);
		System.out.println(discountonBF);
		
		double DiscountAtTheEnd=tele.discountonblackfirday(10);
		System.out.println(DiscountAtTheEnd);
		
		//double totalDiscount=tele.dicountWithCityBank(30, 25);
       // System.out.println(totalDiscount);
		
		
	}

}
