package prj;
	

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;



import Control.ACCESSO_control;
import Control.ANAGRAFICA_CLIENT_controller;
import Model.ACCESSO_model;
import Model.CLIENT_model;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader LOADER= new FXMLLoader(getClass().getResource("/View/ACCESSO.fxml"));
			BorderPane root = (BorderPane)LOADER.load();
		//	AnchorPane root1= (AnchorPane)LOADER.load();
			
			
			Scene scene = new Scene(root);
			
		/*controller dellA CLASS ACCESSO*/	ACCESSO_control controller = LOADER.getController();
		/*MODEL dellA CLASS ACCESSO*/ACCESSO_model model=new  ACCESSO_model();
		
		/*controller dellA CLASS CLIENT*/ //ANAGRAFICA_CLIENT_controller ANAGRAFICACONTROLLER= LOADER.getController();
		/*MODEL dellA CLASS CLIENT*///CLIENT_model CLIENTMODEL= new CLIENT_model();
		//ANAGRAFICACONTROLLER.setclientmodel(CLIENTMODEL);
			
			controller.setmodel(model);
			
		//	LOADER.setController(controller);
			
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
