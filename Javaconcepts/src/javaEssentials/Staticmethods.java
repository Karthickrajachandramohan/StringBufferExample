package javaEssentials;

public class Staticmethods {
	
	//for static methods no need to create an object and also you can call the static method from an non static method
	//static method
	public static void method1() {
		System.out.println("karthick");
	}
	
	//for non static method you should create an object , you can't call the non static method from the static method .
	//non static method
	public void nonStaticMethod() {
		System.out.println("raja");
		method1();
	}

	public static void main(String[] args) {
		Staticmethods obj =new Staticmethods();
		obj.nonStaticMethod();
		

	}

}
