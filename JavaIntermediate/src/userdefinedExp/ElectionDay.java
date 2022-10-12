package userdefinedExp;

public class ElectionDay {
	public static void main(String[] args) {
		Election obj=new Election();
		try {
			obj.checkEligibillity(19);
		}catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
