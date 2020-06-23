package javaEssentials;

public class BankAccount {

	Long AccountNumber = 1234568790l;
	String holdername = "Karthick";
	Integer AccountBalance = 12345;

	public void getBalance(){
		System.out.println("Acccount Balance is " + AccountBalance);
	}



	public static void main(String[] args) {
		// Classname objname = new Classname();

		BankAccount account = new BankAccount();
		account.getBalance();







	}

}
   