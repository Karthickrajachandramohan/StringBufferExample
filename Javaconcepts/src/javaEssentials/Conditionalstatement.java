package javaEssentials;

public class Conditionalstatement{
	
	String Favheroname = "vijay";
	
	public void guessingTheHero() {
		
		if(Favheroname.equals("surya")) {
			System.out.println("Fav surya");
		}
		else if (Favheroname.equalsIgnoreCase("Vijay")) {
			System.out.println("Fav Ajith");
			
		}
		else if (Favheroname.equals("Rajni")) {
			System.out.println("Fav Rajni");
		}
		else
		{
			System.out.println("i am not able to find");
		}
	}

	public static void main(String[] args) {
		
		Conditionalstatement actor = new Conditionalstatement();
		actor.guessingTheHero();

	}

}
