package javaPackage;

public class Static1 {
	
	int x=50;         //global variable
	String s="Hello";  //global
	static int y=100;   //static variable
	
	//static method
	public static void method1()
	{
		String x="HI";   //local variable
		System.out.println("This is static method "+ x);
		System.out.println("This is static method ");
	}
	
	//non static method
	public void method2()
	{
		int i=100;  //local variable
		
		System.out.println("This is non-static method");
	}
	
	
	public static void main(String[] args) {
		
		
		method1();
		
		Static1 s=new Static1();
		s.method2();
		
	}

}
