package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.EndUser;
import model.Main;
import model.Product;
import model.room;

public class productOrder_Controller {
	
	private EndUser endUser;
	
	private Product product;
	
	private room Room;
	
	private Main application;
	
	@FXML
	private Label lblName;
	
	@FXML
	private Label lblDescription;
	
	@FXML
	private Label lblPrice;

	@FXML
	private Label lblQuantity;
	
	@FXML
	private Button btnCancel;
	
	@FXML
	private TextField txtUnits;
	
	public void setApp(Product product, room Room, Main application, EndUser endUser) {
		this.product = product;
		this.Room = Room;
		this.application = application;
		this.endUser = endUser;
		lblName.setText(product.getProductName());
		lblDescription.setText(product.getDescription());
		lblPrice.setText(Integer.toString(product.getPrice()));
		lblQuantity.setText(lblQuantity.getText() + Integer.toString(product.getUnits()));
	}
	
	public void Cancel_button() {
	 	   Stage stage = (Stage) btnCancel.getScene().getWindow();
	 	   
	 	   stage.close();
	 }
	
	public void Decrease_button() {
		int units = Integer.parseInt(txtUnits.getText());
		if (!(units==0))
			txtUnits.setText(Integer.toString(units - 1));
	}
	
	public void Increase_button() {
		int units = Integer.parseInt(txtUnits.getText());
		if (units < this.product.getUnits())
			txtUnits.setText(Integer.toString(units + 1));
	}
	
	public void Cart_button() {
		this.endUser.addToCart(product, Integer.parseInt(txtUnits.getText()));
		this.Cancel_button();
	}
	

}
