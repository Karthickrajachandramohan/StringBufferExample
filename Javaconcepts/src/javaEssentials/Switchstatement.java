package javaEssentials;

public class Switchstatement {
	
	String Favourite = "Vijay";
	
	public void heroName() {
		
		switch (Favourite) {
		case "rajni":
			System.out.println("rajni is my fav");
			break;
		case "Vijay":
			System.out.println("Vijay is my fav");
			break;
		case "vikram":
			System.out.println("vikram is my fav");
			break;
		case "ajith":
			System.out.println("ajith is my fav");
			break;
		case "kamal":
			System.out.println("kamal is my fav");
			break;
		default:
			System.out.println("i am not able to find the person");
			
		}
	}

	public static void main(String[] args) {
		Switchstatement hero = new Switchstatement();
		hero.heroName();

	}

}
