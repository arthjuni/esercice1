package prj;
	

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import Control.ACCESSO_control;
import Model.ACCESSO_model;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader LOADER= new FXMLLoader(getClass().getResource("/View/ACCESSO.fxml"));
			BorderPane root = (BorderPane)LOADER.load();
			
			
			Scene scene = new Scene(root);
			
			ACCESSO_control controller = new ACCESSO_control();
			ACCESSO_model model=new  ACCESSO_model();
			
			
			controller.setmodel(model);
			
			LOADER.setController(controller);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
