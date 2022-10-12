package polmorphism;

public class ploymorphismexample {


	    public static void main(String[] args) {
	        System.out.println("=============Cow=============");
	        Cow cow = new Cow();
	        cow.speak();
	        cow.sleep();
	        System.out.println("=============================");
	        System.out.println("============Animal===========");
	        Animal animal = new Cow();
	        ((Cow) animal).speak();
	        animal.sleep();
	        System.out.println("=============================");
	        System.out.println("============Object===========");
	        Object object = new Cow();
	        ((Cow) object).speak();
	        ((Cow) object).sleep();
	        System.out.println("=============================");
	    }
	}


