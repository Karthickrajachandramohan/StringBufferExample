package javaEssentials;

public class Staticvariables {
	
	static int accountbal ;
	String value ;
	
	public static void main(String[] args) {
		
		Staticvariables obj1 = new Staticvariables();
		obj1.value = "karthick";
		obj1.accountbal = 1000;
		
		Staticvariables obj2 = new Staticvariables();
		obj2.value = "raja";
		obj2.accountbal = 2000;		
		
		
		System.out.println("object 1 value" + obj1.value);
		System.out.println("object 1 account bal " + obj1.accountbal);
		System.out.println("object 2 value" + obj2.value);
		System.out.println("object 2 account bal " + obj2.accountbal);
		

	}

}

// For static variable the value doesn't change with respect to objects. One static variable is created and will be shared among objects .
// static variables shared among objects .
