package Practice.pageobject;

public class SwapTwoNumberAgain {

	public static void main(String[]arg) {
		
		int a=10;
		int b=20;
		
		a=b+a;  //20+10=30
		b=a-b;   //30-20=10
		a=a-b;   //30-10=20
		
		
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
}
