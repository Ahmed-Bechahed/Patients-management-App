module Gestion_soins {
	requires javafx.controls;
	requires javafx.fxml;
//	requires mysql.connector.java;
	requires java.sql;
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml,javafx.base;
}
