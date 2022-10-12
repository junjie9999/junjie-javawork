package userdefinedExp;

public class CheckCC {
	public void check(String ccNo) throws CreditCardException
	{
			if (ccNo.length()> 16)
				throw new CreditCardException("invalid credit car");
			else
				System.out.println("payment completed");
		}
	}

