package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.SuperUser;

public class newStore_Controller {

      private SuperUser SUser;
      private superUser_Controller SuperController;
      
      @FXML
      private Button btnCreate;
      
      @FXML
      private Button btnCancel;
      
      @FXML
      private TextField txStoreName;
      
      @FXML
      private TextField txStoreID;
      
      @FXML
      private TextField txAdminName;
      
      @FXML
      private TextField txAdminID;
      
      @FXML
      private TextField txPassword;
       
       public void setApp(SuperUser SUser, superUser_Controller superController) {
              this.SUser = SUser;
              this.SuperController = superController;
       }
       
       public void Cancel_button(ActionEvent event) {
    	   Stage stage = (Stage) btnCancel.getScene().getWindow();
    	   stage.close();
       }
       
       public void Create_button(ActionEvent event) {
    	   this.SUser.createStore(txStoreName.getText(), txStoreID.getText(), txAdminName.getText(), txAdminID.getText(), txPassword.getText());
    	   this.SuperController.defaultSetup();
       }
       
}

