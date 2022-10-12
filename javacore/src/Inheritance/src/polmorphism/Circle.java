package polmorphism;

public class Circle extends shapes{
	float radius;

	public Circle(String colour, float radius) {
		super(colour);
		this.radius = radius;
	}
	public void calculatedarea() {
		System.out.println(radius*radius);
	

}
}
