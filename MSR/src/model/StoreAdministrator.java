package model;

import java.io.Serializable;
import java.util.*;

public class StoreAdministrator extends Admin implements Serializable{

	private static final long serialVersionUID = 1603250062236453741L;


	public StoreAdministrator(String name, String ID, String pswd, room myRoom) {
		super(name, ID, pswd, myRoom);
	}

	private Store myStore;

}