/*Name: Hugo David Franco Avila
Date: Feb - 20- 2018
This class represents an account of a client in a bank,
it is in a composition relationship with the Client class*/
package bank;

public class Account{
	
	//Attributes
	private int accountNumber;
	private double balance;
	
	//Constructor
	public Account (int accountNumber, double balance){
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	//To String method
	public String getData(){
		String ph;
		ph = ("\nAccount number: " + accountNumber + "\nBalance: $" + balance + "\n");
		return ph;
	}
	

}