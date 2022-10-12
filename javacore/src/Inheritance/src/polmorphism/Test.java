package polmorphism;

public class Test {
	public static void main(String[] args) {
		Liquid l=new Liquid();
		Milk m=new Milk();
		Tea t=new Tea();
		coffee c=new coffee();
		Mug mg=new Mug();
		mg.addLiquid(l);
		mg.addLiquid(t);
		mg.addLiquid(m);
		mg.addLiquid(c);
		
	}

}
