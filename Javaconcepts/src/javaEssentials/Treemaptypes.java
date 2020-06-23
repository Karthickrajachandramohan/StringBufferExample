package javaEssentials;

import java.util.TreeMap;

public class Treemaptypes {
	
	public void method1() {
		TreeMap<String , String> treemap = new TreeMap<String, String>();
		treemap.put("Omalur", "Salem");
		treemap.put("Hasthampatty", "Salem");
		treemap.put("Five roads", "Salem");
		treemap.put("Newbusstand", "Salem");
		
		treemap.put("Salem", "abc");
		treemap.put("Salem", "xyz");
		
		System.out.println(treemap);
		
		//tree maps display the values in ascending order
		//tree maps won't allow the null because it follows ascending order , you can't place null in ascending order
		
	}

	public static void main(String[] args) {
		Treemaptypes obj = new Treemaptypes();
		obj.method1();

	}

}
