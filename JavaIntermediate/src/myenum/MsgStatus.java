package myenum;

public enum MsgStatus {
	SENT("single tick"),
	DELIVERED("Double tick"),
	REED("Double blue tick"),
	DELETED("This msg is deleted");
	
	String des;
	private MsgStatus(String m) {
		des=m;
	}
	public String getMsg() {
		return des;
	}

}
