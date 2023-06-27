package javaPackage;

public class Stirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	////string	
	String s="AjayDeshmukh";
	
	System.out.println(s);
	/////string type array
	String As[]= {"AJAY" , "Deshmukh" , "America" , "pune", "Nanded"};
	System.out.println(As[1]);//Deshmukh
	System.out.println(As[2]);//america
	System.out.println(As.length);//5
	System.out.println(As.clone());//[Ljava.lang.String;@2626b418
	
	
	/////string type array
	String sd[]=new String[5];
	sd[0]="AJAY";
	sd[1]="PATIL";
	sd[2]="BARAMATI";
	System.out.println(sd[1]);//PATIL
	System.out.println(sd[2]);//BARAMATI
	
	/////////////int type array
	
	int a[]=new int[4];
	a[0]=20;
	a[1]=40;
	a[2]=50;
	a[3]=60;
	
	System.out.println(a[2]);//50
	System.out.println(a[3]);//60
	
	////////////int type array
	
	int b[]= {20,40,60,80};
	System.out.println(b[2]);//60
	System.out.println(b[3]);//80
	
	////char type array
	char c[]= {'A', 'b', 'z', 'e', 'S'};
	System.out.println(c[2]);//z
	System.out.println(c[4]);//S
	
	////object type array
	
	Object obj[]= {1,2,3,'A','v','z',"DESHMUKH", "BARAMATI" ,3>2};
	System.out.println(obj[1]);//2
	System.out.println(obj[5]);//z
	System.out.println(obj[7]);//BARAMATI
	
	

	}

}
