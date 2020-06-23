package javaEssentials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collectiontypes{
	
	 List<String> listtypes;







	public void method1() {
		
		List <String>listtypes = new ArrayList<String>();     //arraylist will allow the duplicate values
		//add
		listtypes.add("bmw");
		listtypes.add("benz");
		listtypes.add("volvo");
		listtypes.add("lamborghini");
		
		System.out.println(listtypes);
		//get
		System.out.println(listtypes.get(0));   
		//index position
		System.out.println(listtypes.indexOf("volvo"));
		System.out.println(listtypes.lastIndexOf("lamborghini"));
		
		//to copy the contents of a list to another list
		
		List <String> anotherlist = new ArrayList<String>();
		anotherlist.addAll(listtypes);
		System.out.println(anotherlist); 
		
		//to clear the elements in the arraylist
		
		anotherlist.clear();
		System.out.println(anotherlist);
		
		listtypes.add("scania");
		System.out.println(listtypes);
		
		//to remove the particular element in the arraylist
		
		listtypes.remove(0);
		System.out.println(listtypes);
		
		listtypes.add(0, "bmw");
		System.out.println(listtypes);
		
		listtypes.remove("scania");
		System.out.println(listtypes);
		
		listtypes.add("null");
		System.out.println(listtypes); 
		
		//set - it is used to update the particular index position
		
		listtypes.set(0, "Rolls-Royce");
		System.out.println(listtypes);
		
		System.out.println(listtypes.isEmpty());
		
		//iterate
		
		for(String Value : listtypes ) {
			System.out.println("For each " + Value);
			
		}
		System.out.println("__________________________________________________________________");
		
	    for (int i = 0; i < listtypes.size(); i++) {
	    	System.out.println("using for " + listtypes.get(i));	
			
		}
	    
		 System.out.println("___________________________________________________________________");	
			
			
		}
	
	    
	   
	    
		

		
		


	public static void main(String[] args) {
		Collectiontypes obj = new Collectiontypes();
		obj.method1();
 
	}
	
}




