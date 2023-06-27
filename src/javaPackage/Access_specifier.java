package javaPackage;

public class Access_specifier {

	
	int a=20;
	public int b=20;
	private int c=30;
	protected static int d=40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Access_specifier a=new Access_specifier();
		System.out.println(a);
		a.display();
		a.dispaly1();
		a.dispaly2();
		System.out.println("value of a is " +a.a);
		System.out.println("value of b is " +a.b);
		System.out.println("value of c is " +a.c);
		System.out.println("value of d is " +a.d);
	
		Access_specifier1 g=new Access_specifier1();
		g.add();
		g.display();
		g.mul();
		
		

	}
	
	public void display()
	{
		int e=50;
		System.out.println(e);
		System.out.println(b);
	}
	
	private void dispaly1()
	{
		int f=60;
		System.out.println(f);
		System.out.println(c);
	}
	
	protected void dispaly2()
	{
			int g=70;
			System.out.println(g);
			System.out.println(d);
	}
	
    void display3()
	{
		System.out.println("hi this is display3 method default");
	}
	

}
