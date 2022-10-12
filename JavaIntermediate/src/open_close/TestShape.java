package open_close;

public class TestShape {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(23.00);
		Rectangle r=new Rectangle();
		r.setLength(10.00);
		r.setWidth(20.00);
		
		AreaCalculator ac=new AreaCalculator();
		System.out.println(ac.calculateShapeArea(c));
		System.out.println(ac.calculateShapeArea(r));
		
		
	}
	}


