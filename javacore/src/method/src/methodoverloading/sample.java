package methodoverloading;

public class sample {
	public void sum(int x, int y) {
	}
	public void sum (float a, float b) {}
	public void sum(int x, float y) {}
	public void sum(float y, int x) {}
	public void sum(double x, double y, double z) {}
	public void sum(int x, int y, int z) {}

}
