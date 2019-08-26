/**
 * Sample Skeleton for 'ACCESSO.fxml' Controller Class
 */

package Control;

import java.net.URL;
import java.util.ResourceBundle;

import Model.ACCESSO_model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ACCESSO_control {
	
	String uten;
	String pasw;
	
	ACCESSO_model modela;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Txf_utente"
    private TextField Txf_utente; // Value injected by FXMLLoader

    @FXML // fx:id="Pwf_password"
    private PasswordField Pwf_password; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_invio"
    private Button Btn_invio; // Value injected by FXMLLoader

    @FXML
    void Handler_invio(ActionEvent event) {
    	
    	 uten= this.Txf_utente.getText().toString();
    	 pasw= this.Pwf_password.getText().toString();
    	this.modela.listutpas(uten, pasw);
    	
    	
    	

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Txf_utente != null : "fx:id=\"Txf_utente\" was not injected: check your FXML file 'ACCESSO.fxml'.";
        assert Pwf_password != null : "fx:id=\"Pwf_password\" was not injected: check your FXML file 'ACCESSO.fxml'.";
        assert Btn_invio != null : "fx:id=\"Btn_invio\" was not injected: check your FXML file 'ACCESSO.fxml'.";

    }

	public void setmodel(ACCESSO_model model) {
		// TODO Auto-generated method stub
		this.modela=model;
	}
}
