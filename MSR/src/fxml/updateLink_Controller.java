package fxml;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import model.Main;
import model.Store;
import model.SuperUser;
import model.Warehouse;

public class updateLink_Controller {
       private SuperUser SUser;
       
       private Main application;
       
       private ObservableList<Warehouse> allWarehouses;
       
       private Store store;
       
       @FXML
       private ComboBox<Warehouse> cmbWarehouse;
       
       @FXML
       private Button btnCancel;
       
       @FXML
       private Button btnUpdate;
       
       public void setApp(SuperUser SUser, Main application, Store store) {
               this.SUser = SUser;
               this.application = application;
               this.store = store;
               this.defaultSetup();
       }
       
       public updateLink_Controller() {
    	   this.cmbWarehouse = new ComboBox<>();
       }
       
       public void defaultSetup() {
    	   	allWarehouses = FXCollections.observableList(this.application.getSystem().getDatabase().getWarehouses());
   			cmbWarehouse.setItems(allWarehouses);
       }
       
       public void Cancel_button() {
	 	   Stage stage = (Stage) btnCancel.getScene().getWindow();
	 	   
	 	   stage.close();
       }
       public void Update_button() {
    	   Warehouse warehouse = (Warehouse) cmbWarehouse.getValue();
    	   if (warehouse!=null) {
    		   this.SUser.updateLink(warehouse, this.store);
    	   }
       }
       
}