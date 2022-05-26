package Practice.pageobject;


public class Second extends ThisKeyword{

	
	int a=20;
	
	public void show(int a) {
		
		//System.out.println(a);
		
		//this keyword refer same class's variable
		System.out.println(this.a);
		
		//super keyword refer parent class's variable
		System.out.println(super.a);
		
	}
	
	public static void main(String[]arg) {
		
		Second obj=new Second();
		
		obj.show(30);
		
		
	}
}
