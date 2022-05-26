package Practice.pageobject;

public class Practice {
	
	public static void main(String[]arg) {
		
		int n=7;
		int temp=0;
		for (int i = 2; i <n-1; i++) {
			
			if(n%i==0) {
				
				temp=temp+1;
				
			}
			if (temp>0) {
				System.out.println("7 is non prime number");
				
			}
			
			else {
				
				System.out.println("7 is non prime number");
			}
		}
		
	}

}
