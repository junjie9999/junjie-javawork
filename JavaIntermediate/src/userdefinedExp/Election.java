package userdefinedExp;

public class Election {
	public void checkEligibillity(int age) throws InvalidAgeException
	{
		if (age<18)
			throw new InvalidAgeException("you should be 18 years of age");
		else
			System.out.println("you can only vote for conservative");
		System.out.println("did you vote for conservative Y/N");

}
}
