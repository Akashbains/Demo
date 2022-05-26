package Practice.pageobject;

public class Loop {
	
	public static void main(String[]arg) {
		
		int a=10;
		
		for (int i = 10; i<=a; i--) {
			
			if(i==0) {
				
				break;
			}
			else if (i==5) {
				
				continue;
			}
			
			System.out.println(i);
			
		}
		
	}

}
