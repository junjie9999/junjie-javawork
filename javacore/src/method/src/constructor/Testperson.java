package constructor;

public class Testperson {
	public static void main(String[] args) {
		person p1=new person();
		p1.names="jacky";
		p1.age=23;
		p1.address="uk";
		p1.phone=12356789;
		
		person p2=new person("james",32,"uk", 12358697);
		person p3=new person("stan",22,"USA", 666);
		person p4=new person("luke", 19, "tatooine", 18242);
		person p5=new person("The Doctor",900);
		p5.address="gallifrey";
		p5.phone=95475949;
				
		
		
	}

}
