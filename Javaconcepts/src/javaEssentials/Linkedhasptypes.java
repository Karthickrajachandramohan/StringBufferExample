package javaEssentials;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Linkedhasptypes {
	
	public void linkedMapTypes() {
	
	LinkedHashMap <String , String> linkhash = new LinkedHashMap<String , String> ();
	linkhash.put("odi", "Sachin");
	linkhash.put("T20", "Virat");
	linkhash.put("Test", "Lara");
	
	System.out.println("linked hash set "+ linkhash);
	
	HashMap <String , String> hashset = new HashMap<String , String>();
	hashset.put("odi", "Sachin");
	hashset.put("T20", "Virat");
	hashset.put("Test", "Lara");
	
	System.out.println("Hash set "+ hashset);
	
	// the diff btwn the hash map and linked hash map is Linked hash map follows the insertion order 
	// but the hashmap won't follow the insertion order
 


	}

	public static void main(String[] args) {
		
		Linkedhasptypes linkedhash = new Linkedhasptypes();
		linkedhash.linkedMapTypes();

	}

}
