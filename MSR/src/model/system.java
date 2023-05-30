
package model;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class system {
	
	private Database db;
	
	private SuperUser super_user;

	public system() throws ClassNotFoundException, IOException {
		db = this.deserialize();
		LinkedList<Warehouse> allWarehouses = db.getWarehouses();
		for (int i=0; i<allWarehouses.size();i++) {
			Warehouse w = allWarehouses.get(i);
		}
		super_user = db.getSuperUser();
	}

	public Database getDatabase() {
		return this.db;
	}

	public void serialize() throws IOException{
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("db"));
			out.writeObject(this.db);
		}
		finally {
			if (out!=null)
			out.close();
		}
	}

	public Database deserialize() throws IOException, ClassNotFoundException{
		ObjectInputStream in = null;
		
		try {
			FileInputStream fis = new FileInputStream("db");
			in = new ObjectInputStream(fis);
			db = (Database) in.readObject();
			in.close();
			fis.close();	
			if (db==null) return new Database();
			return db;
		}
		catch (IOException ex) { 
            System.out.println("IOException is caught"); 
            return new Database();
        } 
  
        catch (ClassNotFoundException ex) { 
            System.out.println("ClassNotFoundException" + 
                                " is caught"); 
            return null;
        }
		
	}

}