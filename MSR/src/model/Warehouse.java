package model;

import java.io.Serializable;
import java.util.*;


public class Warehouse extends room implements Serializable{
	
	private Database database;
	private LinkedList<Warehouse> OtherWarehouses;
	private static final long serialVersionUID = -6126848837759993505L;
	private LinkedList<Store> stores;


	public Warehouse(String room_Name, String room_ID, String admin_name, String admin_ID, String admin_pswd, Database database) {
		super(room_Name, room_ID, admin_name, admin_ID, admin_pswd);
		this.database = database;
		this.OtherWarehouses = this.database.getWarehouses();
		this.OtherWarehouses.remove(this);
		stores = new LinkedList<Store>();
	}

	public void linkStore(Store store) {
		this.stores.add(store);
	}

	public Product search(String productName) {
		return null;
	}





	


}