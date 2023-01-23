package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class login_controller implements Initializable {

    @FXML
    private TextField log_id;

    @FXML
    private TextField log_password;
    @FXML
    private Button login_button;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void login_action(ActionEvent e) throws SQLException, IOException {
		Connection cn = PatientDB.getConnection();
		String rq="Select * from Patient where idpatient=? and nom=?";
		PreparedStatement st;
		st=cn.prepareStatement(rq);
		st.setString(1,log_id.getText());
		st.setString(2, log_password.getText());
		ResultSet rs=st.executeQuery();
		int nbr =0;
		while(rs.next()) {
			nbr++;
		}
		
		if (nbr==1) {
			login_button.getScene().getWindow().hide()	;
			Stage view=new Stage();
		    Parent root=FXMLLoader.load(getClass().getResource("ajout_patient.fxml"));
		    Scene scene=new Scene(root);
		    view.setScene(scene);
		    view.show();
		    
			}
		else {
			Alert alert=new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setContentText("ID ou password incorrect ");
			alert.show();
			
		}
		
		
		
		
	}
	
	

  
}
