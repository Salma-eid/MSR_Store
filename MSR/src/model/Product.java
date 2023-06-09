package model;

import java.io.Serializable;
public class Product implements Serializable{
	
	private static final long serialVersionUID = 17740109174622983L;
	private String productName;
	private String Description;
	private int Units;
	private int fixedCost;
	private int carryingCost;
	private int Demand;
	private int price;
	private subCategory parent;
	
	public Product(String Name, String Description, int Units, int fixedCost, int carryingCost, int Demand, int price, subCategory parent) {
		this.productName = Name;
		this.Description = Description;
		this.Units = Units;
		this.fixedCost = fixedCost;
		this.carryingCost = carryingCost;
		this.Demand = Demand;
		this.price = price;
		this.parent = parent;
	}
	public int calculateEOQ() {
		int EOQ = (int) Math.ceil(Math.sqrt(2*this.fixedCost*this.Demand/this.carryingCost));
		return EOQ;
	}
	public void update(String Name, String Description, int Units, int fixedCost, int carryingCost, int Demand, int price) {
		this.productName = Name;
		this.Description = Description;
		this.Units = Units;
		this.fixedCost = fixedCost;
		this.carryingCost = carryingCost;
		this.Demand = Demand;
		this.price = price;
	}
	
	public String toString() {
		return this.productName;
	}
	public String getProductName() {
		return productName;
	}
	public String getDescription() {
		return Description;
	}
	public int getUnits() {
		return this.Units;
	}
	public int getFixedCost() {
		return fixedCost;
	}

	public int getCarryingCost() {
		return carryingCost;
	}

	public int getDemand() {
		return Demand;
	}
	public int getPrice() {
		return price;
	}
	public subCategory getParent() {
		return parent;
	}
	public void reduceUnits(int units) {
		this.Units -= units;
		if (this.Units <= 0) {
			this.parent.getParent().getParent();
		}
	}

}