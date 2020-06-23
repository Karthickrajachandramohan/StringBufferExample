package javaEssentials;

public class Returntypes {
	
	public int amount = 1000;
	
	public int getTheAmount() {
		
		System.out.println("collected the amount " + amount);
		return amount;
	}

	public static void main(String[] args) {
		
		Returntypes obj = new Returntypes();
		int rupees = obj.getTheAmount();
		System.out.println(rupees);

	}

}
