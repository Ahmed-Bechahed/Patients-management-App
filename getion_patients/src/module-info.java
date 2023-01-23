module getion1 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.base;
	
	opens application to javafx.graphics,javafx.fxml,javafx.base;
	opens application.Controllers to  javafx.fxml;
	 opens application.Modeles to javafx.base;
}
