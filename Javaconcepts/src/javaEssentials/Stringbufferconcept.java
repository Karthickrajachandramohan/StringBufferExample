package javaEssentials;

public class Stringbufferconcept {

	public static void main(String[] args) {
		
		StringBuffer kar = new StringBuffer("karthick");
		System.out.println(kar);
		
		//String method
		
		String name1 = "Karthick";
		System.out.println("The apppended name is " + name1.concat("Raja"));
		System.out.println("Original name " + name1);
		
		String name2 = new String("raja");
		System.out.println(name2);
		
		//string buffer
		
		StringBuffer name3 = new StringBuffer("Karthick");
		System.out.println("The apppended name is " + name3.append("raja"));
		System.out.println("Original name " +name3);
		
		// String Buffer methods
		// reverse
		StringBuffer name4 = new StringBuffer("Karthick Raja");
		System.out.println("The reversed name "+ name4.reverse());
		
		// in string buffer only you can reverse the object , you cannot reverse the object in string since its a mutable object whereas Stringbuffer is mutable object .
		
		//replace
		
		StringBuffer name5 = new StringBuffer("Violin");
		
		System.out.println(name5.replace(0, 3, "aaa"));
		
		//delete
		
		StringBuffer name6 = new StringBuffer("abcdef");
		System.out.println(name6.delete(0, 2));
		//insert
		
		StringBuffer name7 = new StringBuffer("Kar");
		System.out.println(name7.insert(3, "thick"));
		
		//Capacity
		System.out.println(name7.capacity());
		
		// Like string we have CharAt , substring , length methods also applicable for the StringBuffer .
		
		// String Builder and String Buffer is almost same except onething . StringBuffer is synchronised [you can access only a single thread at a time]
		// Whereas the String Builder is assynchronised .[you can access multiple threads at a time].
		//StringBuilder/StringBuffer - mutable objects .
		
		//String - immutable object . 
		// string builder is efficient than the string buffer
		
		//String , stringbuffer , stringbuilder are child of char sequence .
		
		//String Builder 
		
		StringBuilder name8 = new StringBuilder("Raja");
		System.out.println(name8 + " is a king");
		
		

	}

}
