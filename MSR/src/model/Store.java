package model;


import java.io.Serializable;
import java.util.*;

public class Store extends room implements Serializable{

	private static final long serialVersionUID = -2080380385842714571L;

	private Warehouse warehouse;
	
	private float fixedCost_D;

	
	public Store(String room_Name, String room_ID, String admin_name, String admin_ID, String admin_pswd) {
		super(room_Name, room_ID, admin_name, admin_ID, admin_pswd);
	}
	
	public void linkWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	public Product search(String productName) {
		return null;
	}



}