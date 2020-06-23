package javaEssentials;

public class Constructortypes extends ParentClass{
	
	String Animal_name;
	String Animal_type;
	
	    Constructortypes(String name , String type){
		Animal_name = name ;
		Animal_type = type ;
	}
	 
	 public void sayAboutAnimal() {
		 System.out.println("animal name is "+ Animal_name + " and type is " +  Animal_type );
	 }

	public static void main(String[] args) {
		
		Constructortypes obj = new Constructortypes("Lion"," carnivores");
		obj.sayAboutAnimal();
		Constructortypes obj1 = new Constructortypes("Tiger"," carnivores");
		obj1.sayAboutAnimal();

		
	}

}
