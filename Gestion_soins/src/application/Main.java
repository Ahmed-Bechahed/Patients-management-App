package application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Stage st=primaryStage;
		
		try {
			Parent root=FXMLLoader.load(getClass().getResource("login.fxml"));
			Scene scene = new Scene(root,700,400);
			primaryStage.setScene(scene);
			//Image icon=new Image("/Gestion_soins/src/application/Capture d’écran 2021-11-12 024221.png");
			//primaryStage.getIcons().add(icon);
			primaryStage.show();
			primaryStage.setTitle("saints");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
		

	
	
	
	public static void main(String[] args) {

		launch(args);


	
	}
}
