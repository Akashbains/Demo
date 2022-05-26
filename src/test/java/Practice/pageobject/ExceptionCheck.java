package Practice.pageobject;

public class ExceptionCheck {
	
	public static void main(String[]arg) {
		
		/*
		 * String name=null; System.out.println(name.length());
		 * 
		 */
		
		/*System.out.println("1");
		System.out.println("2");
		System.out.println(100/0);
		System.out.println("3");
	}*/
		
		
try {
			
			System.out.println("1");
			System.out.println("2");
			System.out.println(100/0);
			
		} catch (ArithmeticException e) {
			
			//System.out.println(e);
			// TODO: handle exception
		}
		System.out.println("3");

}
}
