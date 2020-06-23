package javaEssentials;

public class Stringexamples {
	

		
	
	public static void main(String[] args) {
		
		String name = " karthick raja ";
		int num = 3;

		// returns character value for the particular index
		System.out.println(name.charAt(0));
		
		// to know the length 
		System.out.println(name.length());
		
		// to check the equality of the given string
		
		System.out.println(name.equals("vijay"));
		
		//to check the string case sensitivity
		
		System.out.println(name.equalsIgnoreCase("KARTHICK RAJA"));
		
		// to check if the string is empty or not
		
		System.out.println(name.isEmpty());
		
		// contains - to check the particular character present in the string or not
		
		System.out.println(name.contains("a"));
		
		// to take the particular portion of the string
		
		System.out.println(name.substring(2));
		
		// substring(begin index and end index)
		System.out.println(name.substring(1, 5));
		
		//appends (adding the value) in given string
		System.out.println(name.concat("chandramohan"));
		
		//replace the char with given char
		System.out.println(name.replace("k", "c"));
		System.out.println(name.replace("karthick", "vijay"));
		
		//finds the position of the character
		System.out.println(name.indexOf("a"));
		
		//finds the char specified in index position
		System.out.println(name.indexOf("a", 2));
		System.out.println(name.indexOf("aja", 1));
		
		//trim is used to remove the white spaces
		System.out.println(name.trim());
		
		//to convert the given data type to string
		System.out.println(String.valueOf(num));
		
		//to convert the upper case to lower case
		String Value = "SACHIN";
		System.out.println(Value.toLowerCase());
		//to convert the lower case to upper case
		String Values = "dravid";
		System.out.println(Values.toUpperCase());
		
		// Join 
		
		System.out.println(String.join("-", "India" , "is" , "my", "country"));
		System.out.println(String.join("/", "22","12","1994"));
		
		//split
		
		String splitThis = "am , I a good man,";
		String [] splittedwords = splitThis.split(",");
        for(String string:splittedwords) {
        	System.out.println(string);
        }
        }
		
         // String can be created by using the string literal and by using the new keyword .
		//string = immutable object
	    //string buffer = muttable object
		
		
		
		

	}


