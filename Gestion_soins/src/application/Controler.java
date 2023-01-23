package application;



import java.io.IOException;
import java.sql.SQLException;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controler {

   @FXML
   private TextField saisir_nom;
   @FXML
   private TextField saisir_prenom;
   @FXML
   private TextField saisir_num_cin;
   @FXML
   private TextField saisir_date_naissance;
   @FXML
   private RadioButton saisir_sexe;
   @FXML
   private TextField saisir_tel;
   @FXML
   private TextArea saisir_description;
   @FXML
   private Label confirm_message;
    @FXML
    private Button ajout_patient;
    @FXML
    private Button new_patient;
    public void controler_1(ActionEvent e) {
    	System.out.println("ouii");
    	  Patient p=new Patient(saisir_nom.getText(),saisir_prenom.getText(),Integer.parseInt(saisir_num_cin.getText()),saisir_date_naissance.getText(),saisir_sexe.getText(),Integer.parseInt(saisir_tel.getText()),saisir_description.getText());
    	    DAO D=new DAO();
    		D.Ajouter(p);
	confirm_message.setText("Patient ajout� avec success...");
	
    }
    
    public void controler_2(ActionEvent e) throws IOException {
    new_patient.getScene().getWindow().hide();
    Stage view=new Stage();
    Parent root=FXMLLoader.load(getClass().getResource("recherche_patient.fxml"));
    Scene scene=new Scene(root);
    view.setScene(scene);
    view.show();
    }
  
    
    
    
    
    
	
}
