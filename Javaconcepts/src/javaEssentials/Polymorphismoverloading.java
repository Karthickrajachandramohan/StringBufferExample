package javaEssentials;

public class Polymorphismoverloading {
	
	public void cricketTypes(T20  format) {
		System.out.println("Players will play aggressively to score runs");
	}
	public void cricketTypes(Odi  format) {
		System.out.println("Players will play steadily");
		
	}
	public void cricketTypes(Test  format) {
		System.out.println("players will stick to basics of the game");
	}

	public static void main(String[] args) {
		Polymorphismoverloading karthick = new Polymorphismoverloading();
		T20 game = new T20();
		karthick.cricketTypes(game);
		Odi game1 = new Odi();
		karthick.cricketTypes(game1);
		Test game2 = new Test();
		karthick.cricketTypes(game2);
		
		
		

	}

}
