package staticexample;

public class Test {
	public static void main(String[] args) {
		Sample obj1=new Sample();
		obj1.name="angle";
		obj1.Ni=200004;
		
		Sample obj2=new Sample();
		obj1.name="demon";
		obj1.Ni=99911134;
		
		Sample.nameOfOrg="Oracle";
		System.out.println(Sample.nameOfOrg);
		
		Mysample obj3= new Mysample();//101
		obj3.y=10;
		System.out.println(obj3.y);
		obj3.y++;
		System.out.println(obj3.y);
		//System.out.println(Mysample.staticy++);//102
		System.out.println(Mysample.staticy++);//103
		
		Mysample obj4= new Mysample();//104
		obj4.y=10;
		System.out.println(obj4.y);
		obj4.y++;
		System.out.println(obj4.y);
		System.out.println(Mysample.staticy++);//105
		System.out.println(Mysample.staticy++);
		
		Mysample obj5= new Mysample();//
		obj4.y=10;
		System.out.println(obj5.y);
		System.out.println(Mysample.staticy++);
		System.out.println(Mysample.staticy++);
	
		
			
		}
		
		
	}
