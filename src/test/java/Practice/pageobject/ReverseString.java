package Practice.pageobject;

public class ReverseString {
	
	public static void main(String[]arg) {

		String name="akash";
		
		int indexValue=name.length();
		
		
		String reverse=" ";
		
		for(int i=indexValue-1; i>=0 ; i--) {
			
			reverse=reverse+name.charAt(i);
			
			
		}
		
		System.out.println(reverse);
		
	
	}


}
