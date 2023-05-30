package model;

import java.io.Serializable;
import java.util.*;

public class WarehouseAdministrator extends Admin implements Serializable{

	private static final long serialVersionUID = 3697727863991709580L;

	public WarehouseAdministrator(String name, String ID, String pswd, room myRoom) {
		super(name, ID, pswd, myRoom);
	}



}