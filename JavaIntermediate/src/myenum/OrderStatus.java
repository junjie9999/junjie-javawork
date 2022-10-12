package myenum;

public enum OrderStatus {
	PENDING("order pending "),
	COMPLETED("payment complete"),
	REJECTED("order rejeected"),
	DELIVERED("order delivered"),
	FEEDBACKCOLLECTED("please give feed back");
	
	String Msg;
	private OrderStatus(String z) {
		Msg=z;
	}
	public String getMsg() {
		return Msg;
				
	}
	
	

}
