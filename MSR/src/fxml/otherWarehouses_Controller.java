package fxml;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Main;
import model.Warehouse;
import model.room;

public class otherWarehouses_Controller {
	
	private room Warehouse;
	
	private Main application;
	
	private ObservableList<Warehouse> allWarehouses;
	
	@FXML
	private ListView lsvWarehouse;
	
	public void setApp(room Warehouse, Main application) {
		this.Warehouse = Warehouse;
		this.application = application;
		this.defaultSetup();
	}
	
	public otherWarehouses_Controller() {
		lsvWarehouse = new ListView();
	}
	
	public void defaultSetup() {
		allWarehouses = FXCollections.observableList(this.application.getSystem().getDatabase().getWarehouses());
		lsvWarehouse.setItems(allWarehouses);
	}
	
	public void refreshButton() {
		this.defaultSetup();
	}
	public void openButton() {
		Warehouse toOpen = (Warehouse) lsvWarehouse.getSelectionModel().getSelectedItem();
		
		if (toOpen != null) {
			this.application.categoriesDisplay(toOpen, "warehouseAdmin", "Categories", null, null, null);
		}
	}

}
