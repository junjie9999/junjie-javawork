package finalexample;

public class TestFinal {
	public static void main(String[] args) {
		sampleFinal obj=new sampleFinal();
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		sampleFinal obj1=new sampleFinal(444);
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		sampleFinal obj2=new sampleFinal(111,666);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		
		Country India=new Country(30);
		Country USA=new Country(40);
		Country Uk=new Country(20);
		Country xx=new Country(0);
		
	}

}
