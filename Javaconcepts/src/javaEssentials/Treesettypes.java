package javaEssentials;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesettypes {
	
  public void treeSetExample() {
	  
		TreeSet<Integer> treetypes = new TreeSet<Integer>();
		treetypes.add(1);
		treetypes.add(2);
		treetypes.add(3);
		treetypes.add(4);
		treetypes.add(5);
		treetypes.add(10);
		System.out.println("Elements are sorted on ascending order " + treetypes);
		//first()
		System.out.println("first element " + treetypes.first());
		//last()
		System.out.println("second element " + treetypes.last());
		//headset() - it gives value that less than the given value  
		System.out.println("headset "+ treetypes.headSet(3));
		//tailset() - it gives value that higher than the given value  
		System.out.println("tailset "+ treetypes.tailSet(5));
		//comparator
		System.out.println("comparator returns null if the sorting is default natural order  : "+ treetypes.comparator());
		//higher();
		System.out.println("returns higher value "+ treetypes.higher(3));
		//lower()
		System.out.println("returns lower value "+ treetypes.lower(5));
		//pollfirst() - it will retrive the first element and delete it
		System.out.println("poll first "+ treetypes.pollFirst());
		//polllast() - it will retrive the second element and delete it 
		System.out.println("poll last "+ treetypes.pollLast());
		System.out.println("After polling " + treetypes);
		//descending
		System.out.println("descending order "+ treetypes.descendingSet());
		//iterator;
		Iterator <Integer> iterator = treetypes.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		Iterator <Integer> iteratordesccending = treetypes.descendingIterator();
		
		while(iteratordesccending.hasNext()) {
			System.out.println(iteratordesccending.next());
			
		}
		

		
		
	   
   }
  
	public static void main(String[] args) {
		Treesettypes obj = new Treesettypes();
		obj.treeSetExample();
	}

}
