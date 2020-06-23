package javaEssentials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collectiontypes2 {
	
	
	public void method2() {

		
		List <String> arraytypes = new ArrayList<String>();
		arraytypes.add("pulsar");
		arraytypes.add("apache");
		arraytypes.add("splendor");
		arraytypes.add("splendor");
		System.out.println(arraytypes);
		
		ListIterator<String> iterator = arraytypes.listIterator();
		
		// In list iterator both forward and reverse traverse possible
		
		//forward
		while(iterator.hasNext()) {
			System.out.println(iterator.next() );
		}
		System.out.println("________________________________________________________________");
		//reverse
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		System.out.println("_________________________________________________________________");
		
		//In iterator only forward traverse possible
		
		Iterator<String> Value = arraytypes.iterator();
		
		while(Value.hasNext()) {
			System.out.println(Value.next());
		}
		
		

	
	}

	public static void main(String[] args) {
		Collectiontypes2 obj = new Collectiontypes2();
		obj.method2();
		
		

	}

}
