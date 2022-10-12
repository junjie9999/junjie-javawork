package polmorphism;

public class square extends shapes {
	float sides;

	public square(String colour, float sides) {
		super(colour);
		this.sides = sides;
	}
	public void calculatedarea() {
		System.out.println(sides*sides);
	}
	

}
