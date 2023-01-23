package application;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class recherche_patient_controller  implements Initializable{

	 @FXML
	    private TableView <Patient> set_table;
    @FXML
    private TableColumn<Patient, String> nom_table;

    @FXML
    private TableColumn<Patient, Integer> id_table;

    @FXML
    private TableColumn<Patient, Integer> num_cin_table;

    @FXML
    private TableColumn<Patient, String> prenom_table;

    @FXML
    private TableColumn<Patient, String> sexe_table;

    @FXML
    private TableColumn<Patient, Integer> tel_table;
    @FXML
    private TableColumn<Patient, String> description_table;
    @FXML
    private TableColumn<Patient, String> date_naissance_table;
    @FXML
    private Button view_button;

    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		id_table.setCellValueFactory(new PropertyValueFactory<>("ID"));
    	nom_table.setCellValueFactory(new PropertyValueFactory<>("nom"));
    	prenom_table.setCellValueFactory(new PropertyValueFactory<>("prenom"));
    	num_cin_table.setCellValueFactory(new PropertyValueFactory<>("num_cin"));
    	sexe_table.setCellValueFactory(new PropertyValueFactory<>("sexe"));
    	date_naissance_table.setCellValueFactory(new PropertyValueFactory<>("Date_naissance"));
    	tel_table.setCellValueFactory(new PropertyValueFactory<>("tel"));
    	description_table.setCellValueFactory(new PropertyValueFactory<>("description"));
    	try {
			set_table.setItems( new DAO().getall());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
	}
   


	
	

	
}




