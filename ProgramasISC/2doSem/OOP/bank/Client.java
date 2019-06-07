/*Name: Hugo David Franco Avila
Date: Feb - 20- 2018
This class represents a client inside a bank, accounts are created
inside this class, and clients are attribute for the bank*/
package bank;

public class Client{
	
	//Attributes
	private Account account;
	private String name;
	private Bank bank;
	
	//Constructor
	public Client (String name, int num, double bal, Bank bank){
		
		this.account = new Account(num, bal);//composition
		this.name = name;
		this.bank = bank;//aggregation
		
	}
	
	//To String method
	public String getData(){
		String fr;
		fr = ("\nClient name: " + name + account.getData() + bank.getData());
		return fr;
	}
	
	/*This method returns the name of the client*/
	public String getName(){
		String nam;
		nam = name;
		return nam;
	}

}