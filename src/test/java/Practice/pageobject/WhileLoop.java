package Practice.pageobject;

public class WhileLoop {
	
	public static void main(String[]arg){
		
		
		int i=1;
		
		while (i<=10) {
			
			if (i==5) {
				
				//break;
				i++;
				continue;
			}
			
			
			System.out.println(i);
			
			i++;
			
		}
		
	}

}
