package bookobject;

public class Testclass {
	public static void main(String[] args) {
		Books book1=new Books(); //allocates memory
		book1.title="AND THEN THERE WERE NONE";
		book1.author= "AGATHA CHRISTIE";
		book1.price= 5.00F;
		book1.publisher= "HarperCollinsPublisher";
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.price);
		System.out.println(book1.publisher);
		book1.print();
	}

}
