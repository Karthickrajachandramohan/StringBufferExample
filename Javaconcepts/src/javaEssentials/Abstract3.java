package javaEssentials;

public class Abstract3 extends Abstractconcepts {
	
	@Override
	public void car() {

		System.out.println("Engine secret for Benz");
	
	}
	@Override
	public void companyVault() {

		System.out.println("CompanyVault for benz");
	
	}

	public static void main(String[] args) {
		Abstractconcepts obj = new Abstract3();
		obj.car();
		obj.companyVault();
		

		
	}

}
