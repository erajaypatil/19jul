package javaPackage;

public class vairbale {

	
	int a=10;  //global varibale
	static int b=20;
	public static void main(String[] args) {

		
	//Array a[]=new Array[];
	String s="546512";
    String s1="Ajay roakde,kiran mahajan";
    System.out.println(s1.toUpperCase().concat(s));
	int g=Integer.parseInt(s);
	System.out.println(g);
	System.out.println(s.length());
	
	
		//System.out.println(a);
		System.out.println("b is static global variable"+  b);
		
		vairbale v=new vairbale();
		v.A();
		
		
	}
	
	public void A()
	{
		int c=40;
	
		System.out.println("a is global variable " +a);
		System.out.println("c is local a() method variable" +c);
		System.out.println("a is non static global varibale" +a);
	}
}
