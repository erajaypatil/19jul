package javaPackage;

public class Constructor_Study {
	
	String s="AjayRokade";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_Study c=new Constructor_Study();
		c.dispaly();
		
		

	}
	
	public void dispaly()
	{
		System.out.println("Hi this is non static dispaly method");
		System.out.println("Gobal variable name is " + s);
	}

}
