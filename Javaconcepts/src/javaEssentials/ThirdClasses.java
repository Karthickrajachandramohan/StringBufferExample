package javaEssentials;

public class ThirdClasses extends Secondclasses{

	public static void main(String[] args) {
		ThirdClasses bmw = new ThirdClasses();
		bmw.method1();
		

	}

}

// Access modifiers                Same class    same package     subclass     other packages

//public                              Y              Y                Y                Y

//protected                           Y              Y                Y                Y     

//default(no access modifier)         Y              Y                N                N 

//private                             Y              N                N                N