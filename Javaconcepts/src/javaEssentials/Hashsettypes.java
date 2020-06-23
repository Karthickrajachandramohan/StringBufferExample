package javaEssentials;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsettypes {
	
	public void hashSetExamples() {
	
	HashSet<String>Valuehash = new HashSet<String>();
	
	Valuehash.add("Sachin");
	Valuehash.add("dravid");                              //hashset won't allow the duplicate values and also won't follow the order
	Valuehash.add("dhoni");
	Valuehash.add("ganguly");
	Valuehash.add("Kholi");
    Valuehash.add("Sachin");
    Valuehash.add("null");
	
	System.out.println(Valuehash);
	
	Valuehash.remove("null");
	System.out.println(Valuehash);
	
	System.out.println(Valuehash.contains("Sachin"));
	
	HashSet<String> Anothertype = new HashSet<String>();
	Anothertype.addAll(Valuehash);
	
	System.out.println(Valuehash);
	
	Iterator<String> iterator = Valuehash.iterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	
	
		
	}
	
	//Set
	//Duplicates are not allowed
	//Insertion order not maintained
	//Can insert heterogeneous objects(if generics are not used)
	
	
	
	
	

	
	

	public static void main(String[] args) {
		Hashsettypes obj = new Hashsettypes();
		obj.hashSetExamples();

	}

}
