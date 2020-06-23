package javaEssentials;

import java.util.ArrayList;
import java.util.List;

public class Newarrays {
	
	public void method1() {
		
		List <String> arraytypes = new ArrayList<String>();
		arraytypes.add("pulsar");
		arraytypes.add("apache");
		arraytypes.add("splendor");
		arraytypes.add("splendor");
		System.out.println(arraytypes);

	}

	public static void main(String[] args) {
		Newarrays obj = new Newarrays();
		obj.method1();

	}

}
