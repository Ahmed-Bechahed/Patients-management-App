package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DAO {
	
			public void  Ajouter(Patient p) {
			Connection c = PatientDB.getConnection();
			if (c != null) {
			try { PreparedStatement ps = c.prepareStatement("insert into Patient (nom,prenom,num_cin,date_naissance,sexe,tel,description) values (?,?,?,?,?,?,?);");
			ps.setString(1, p.getNom());
			ps.setString(2, p.getPrenom());
			ps.setInt(3, p.getNum_cin());
			ps.setString(4, p.getSexe());
			ps.setString(5, p.getDate_naissance());
			ps.setInt(6, p.getTel());
			ps.setString(7, p.getDescription());
			
			int res = ps.executeUpdate();
			}
			 catch (Exception e) { e.printStackTrace(); }
			}}	
			
			public ObservableList<Patient>  getall() throws SQLException {
				
				Connection cn = PatientDB.getConnection();
				ResultSet rs;
				PreparedStatement pst=null;
				String sql="Select * From Patient";
				try {
					pst= cn.prepareStatement(sql);
					System.out.println("success d'executer la requette select all ");
				} catch (SQLException e) {
					System.out.println(e.getMessage());}
				
				 rs = pst.executeQuery("Select * From Patient") ;
				 ObservableList <Patient> listPr = FXCollections.observableArrayList();
					while(rs.next()) {
						
						listPr.add(new Patient(rs.getInt("idpatient"), rs.getString("nom"),rs.getString("prenom"),rs.getInt("num_cin"),rs.getString("sexe"),rs.getString("date_naissance"),rs.getInt("tel"),rs.getString("description")));}
						return listPr;
					
					}

			
			
			
}
