package javaPackage;

public class Access_specifier1 {

	
	
	int a=20;
	public int b=30;
	private int c=40;
	protected static int d=50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_specifier1 f=new Access_specifier1();
		f.add();//130
		f.sub();//20
		f.mul();//2000
		f.display();//hi i am defalut method
		
		System.out.println("value of a is " + f.a);//20
		System.out.println("value of b is " + f.b);//30
		System.out.println("value of c is " + f.c);//40
		System.out.println("value of d is " + f.d);//50
		
		
		
		

	}
	
	public void add()
	{
		
		int a,b=60, c=70;
		a=c+b;
		System.out.println("value of a is " + a);
	}
	
	private void sub()
	{
		int a,b=40; c=60;
		a=c-b;
		System.out.println("value sub of a is " + a);
	}
	
	protected void mul()
	{
		int a,b,c=50;
		int d=40;
		a=c*d;
		System.out.println("value mul of a is " + a);
	}
	
	void display()
	{
		System.out.println("Hi i am default method ");
		
	}

}
