package polmorphism;

public class Mug {
	public void addLiquid(Liquid x) {
		
	if(x instanceof Milk)
	System.out.println("milk");
	else if (x instanceof coffee)
		System.out.println("coffee");
	else if (x instanceof Tea)
		System.out.println("swril tea");
	
	else
		System.out.println(" smart water");
	}

}
