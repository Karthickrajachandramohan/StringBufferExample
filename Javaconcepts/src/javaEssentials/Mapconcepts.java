package javaEssentials;

import java.util.HashMap;

public class Mapconcepts {
	
	public void method1() {
		
		HashMap<Integer , String> maptypes = new HashMap<Integer , String>();
		maptypes.put(1, "Vijay");
		maptypes.put(2, "Ajith");
		maptypes.put(3, "Rajini");
		maptypes.put(4, "Kamal");
		maptypes.put(5, "surya");
		maptypes.put(6, "vikram");
		
		System.out.println("types of map " + maptypes);
		
		//to make a copy 
		HashMap<Integer , String> duplicatemap = new HashMap<Integer , String>();
		duplicatemap.putAll(maptypes);
		
		System.out.println("duplicatemap "+ duplicatemap);
		System.out.println("types of map " + maptypes);
		
		//clear the map contents
		duplicatemap.clear();
		System.out.println("duplicatemap "+ duplicatemap);
		
		//to check the key present in the map or not
		System.out.println("types of map " + maptypes.containsKey(10));
		//to check the value present in the map or not
		System.out.println("types of map " + maptypes.containsValue("vikram"));
		
		//to clone the map
		System.out.println("Clone " + maptypes);
		
		//is empty
		System.out.println("types of map " + maptypes.isEmpty());
		
		//To fetch keys in the map (Note : Here it is called as Set of keys not list of keys)
		//Because keys won't allow duplicate but List will allow . Keys always unique
		
		System.out.println("keys set "+maptypes.keySet());
		
		//to fetch a value
		
		System.out.println("Value "+maptypes.get(2));
		
		
		//to fetch all the value
		System.out.println("All the values "+maptypes.values());
		
		//entry set
		System.out.println("entry set "+maptypes.entrySet());
		
		System.out.println("key String "+maptypes.getOrDefault(1, "Vijay"));




		


		


		

		
		
		
	}

	public static void main(String[] args) {
		Mapconcepts mapconcept = new Mapconcepts();
		mapconcept.method1();

	}

}
