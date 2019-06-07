/*
Name: Team 3
Date: 27 - 04 -18
This class represents a vending machine, that receives
*/
package logic;

import java.util.ArrayList

public class Machine{
	
	//Attributes
	private User user;
	private ArrayList<Product> products;
	private int money;
	
	/*Constructor default, entonces creo que no hay que 
	definirlo
	public Machine(){
		
	}
	*/

	public void setUser(User user){
		this.user = user;
	}
	
	public User getUser(){
		return this.user;
	}
	
	public ArrayList<Product> getProducts(){
		return this.products;
	}
	
	public void setProducts(ArrayList<Product> products){
		this.products = products;
	}
	
	public void setMoney(int money){
		this.money = money;
	}
	
	public int getMoney(){
		return this.money;
	}
	
	/* No supe que poner, creo que habria que ponerle 
	como atributo a producto un numero identificador o
	algo por el estilo
	public boolean validateNumber(){
		return true;
		
	}
	*/
	
	/*Esta funcion no estoy seguro de como implementarla*/
	public boolean validateMoneyIntroduced(){
		return true;
	}
	
	/*Este metodo lee la disponibilidad de un producto
	que este en el array, y si hay mas de uno regresa true.
	Si no hay o no existe, regresa false*/
	public boolean validateAvailability(String n){
		for(int i = 0; i < products.length(); i++){
			if(products.get(i).getName().equalsIgnoreCase(n)){
				if(products.get(i).getAvailability > 0){
					return true;
					products.get(i).setAvailability((products.get(i).getAvailability()) - 1);
				} else {
					return false;
				}
			} else{
				return false;
			}
		}
	}
	
	/*Este metodo regresa un entero, que es el valor del cambio 
	que se le debe dar al usuario despues de que hay metido
	dinero. Solo se regresa cambio si no le falta dinero
	o da el valor exacto*/
	public int calculateChange(int cash, String n){
		for(int i = 0; i < products.length(); i++){
			if(products.get(i).getName().equalsIgnoreCase(n)){
				if(cash > products.get(i).getCost()){
					return cash - products.get(i).getCost();
				} else if(cash == products.get(i).getCost()){
					return 0;
				} else{
					return -1;//bandera que dice que hace falta mas dinero
				}
			}
		}
	}
	
	public void addProductQuantity(int add, String n){
	/*hay que escribir una forma mas sencilla de 
	elegir el producto que se va a agregar*/
		for(int i = 0; i < products.length(); i++){
			if(products.get(i).getName().equalsIgnoreCase(n)){
				products.get(i).setAvailability((products.get(i).getAvailability()) + add);
			}
		}
	}
}