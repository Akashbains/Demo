package Practice.pageobject;

public class PrimeNumberCheck {
	
	public static void main(String[]arg) {
		
		int number=7;
		int temp=0;
		
		for(int i=2;i<number-1;i++) {
			
			if(number%i==0){
				
				temp=temp+1;
			}
		
		if(temp>0) {
			
		System.out.println("7 is non prime number");
		}
		else {
			
			System.out.println("7 is prime number");
		}
		}
		
		
	}

}
