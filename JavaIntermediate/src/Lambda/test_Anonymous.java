package Lambda;

public class test_Anonymous {
	public static void main(String[] args) {
	
	
	//anonymous class
	Greeting gr=new Greeting() {
		public void greet() {
			System.out.println("hello");
		}
		public void welcome() {
			System.out.println("wellcome");
		}
	};
	gr.greet();
	//gr.welcome() 
	Greeting gr1=()->{System.out.println("hello");};
	gr1.greet();
	// with args and return type
	GreetingWithNames grname=(x)->{System.out.println("hello");};
	grname.greet("james");
	//lambda args with return types
	Return grReturn=(x)->{return "hello "+x;};
	System.out.println(grReturn.greet("me"));
	
	
	}
}
	


