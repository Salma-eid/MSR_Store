package model;

import java.io.Serializable;
import java.util.*;


public class EndUser implements Serializable{
	private static final long serialVersionUID = 7033958869979060232L;
	private String Name;
	private String Password;
	private Cart cart;

	public EndUser() {
		this.Name = "EndUser";
		this.Password = "Password";
		this.cart = new Cart();
	}
	public Cart getCart() {
		return this.cart;
	}
	public void checkOut() {
		this.cart.checkOut();
		this.cart = new Cart();
	}
	public void addToCart(Product product, int Units) {
		this.cart.add(product, Units);
	}
	public Collection<Product> showCart() {
		return null;
	}


}