package myenum;

public class Test {

	public static void main(String[] args) {
		colours mycolor= colours.BLUE;
		System.out.println(mycolor);
		
		MsgStatus mObj=MsgStatus.REED;
		System.out.println(mObj.getMsg());
		
		OrderStatus ord=OrderStatus.COMPLETED;
		System.out.println(ord.getMsg());

	}

}
