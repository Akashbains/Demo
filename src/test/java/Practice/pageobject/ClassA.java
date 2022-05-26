package Practice.pageobject;

public class ClassA {

	int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ClassA o=new ClassA();
	o.local();
	
	}

 void local() {
		int c=10;
	int d= a+b+c;
		
	System.out.println("d="+d);
		
 	}


}