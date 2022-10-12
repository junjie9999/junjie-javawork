package methodoverloading;

public class Length {
	public static void main(String[] args) {
		String Quotes="Time is money";
		int count=0;
		
		for(int i=0;i<Quotes.length();i++) {
			//if(Quotes.charAt(i)!='')
				count++;
		}
		System.out.println("total characters"+count);
				
	}

}
