package javaEssentials;

public class Overriddingpolymorphism extends Polymorphismover {
	
	@Override
	public void bestBowler() {
		
		System.out.println("Zaheer khan is the best bowler");
	}

	public static void main(String[] args) {
		
		Overriddingpolymorphism cricket = new Overriddingpolymorphism();
		cricket.bestBatsmen();
		cricket.bestBowler();

	}

}
