package javaPackage;

public class Constructor_Study1 {
	
	String d="Pune";
	
	String name;
	
	
	public Constructor_Study1()
	{
		name="America";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         display1();
		Constructor_Study1 cs=new Constructor_Study1();
		cs.display();
	}
	
	public void display()
	{
		System.out.println("This is non static method diplay ");
		System.out.println("The city name is " + d);
		System.out.println("The country name is " +name);
	}
	
	public static void display1()
	{
		System.out.println("This is static display1 method");
	}
	

}
