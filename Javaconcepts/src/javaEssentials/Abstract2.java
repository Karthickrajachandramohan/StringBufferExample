package javaEssentials;

public class Abstract2 extends Abstractconcepts {
	
	@Override
	public void car() {

		System.out.println("Engine secret for BMW");
	
	}
	
	@Override
	public void companyVault() {

		System.out.println("companyVault for BMW");
	
	}

	public static void main(String[] args) {
		
		Abstractconcepts obj = new Abstract2(); //parentclass objectname = new childclassname(); -> dynamic polymorphism concept
		obj.car();
		obj.companyVault();

	}

}
