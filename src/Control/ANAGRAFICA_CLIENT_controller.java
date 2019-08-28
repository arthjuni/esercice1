/**
 * Sample Skeleton for 'ANAGRAFICA_CLIENT.fxml' Controller Class
 */

package Control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.CLIENTE_Bean;
import Model.CLIENT_model;
import Model.Dao.ACCESSO_Dao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class ANAGRAFICA_CLIENT_controller {
	
	CLIENT_model clmod=new CLIENT_model();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Txf_cognome"
    private TextField Txf_cognome; // Value injected by FXMLLoader

    @FXML // fx:id="Txf_nome"
    private TextField Txf_nome; // Value injected by FXMLLoader

    @FXML // fx:id="Txf_indirizzo"
    private TextField Txf_indirizzo; // Value injected by FXMLLoader

    @FXML // fx:id="Txf_email"
    private TextField Txf_email; // Value injected by FXMLLoader

    @FXML // fx:id="Txf_telefonocellulare"
    private TextField Txf_telefonocellulare; // Value injected by FXMLLoader

    @FXML // fx:id="Txf_telefonocasa"
    private TextField Txf_telefonocasa; // Value injected by FXMLLoader

    @FXML // fx:id="Dtp_datadinascita"
    private DatePicker Dtp_datadinascita; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_invio"
    private Button Btn_invio; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_cancel"
    private Button Btn_cancel; // Value injected by FXMLLoader
    
    
    @FXML
    void Handler_invio(ActionEvent event) {

    	if ((Txf_cognome.getText().isEmpty() || Txf_cognome.getText().equals(null)  )|| (Txf_email.getText().isEmpty()|| Txf_email.getText().equals(null) )|| (Txf_indirizzo.getText().isEmpty() || Txf_indirizzo.getText().equals(null) )|| (Txf_nome.getText().isEmpty() || Txf_nome.getText().equals(null) )|| (Txf_telefonocasa.getText().isEmpty() || Txf_telefonocasa.getText().equals(null) )||( Txf_telefonocellulare.getText().isEmpty() || Txf_telefonocellulare.getText().equals(null))) {
			
    		Alert parle=new Alert(AlertType.WARNING, "dovete compilare il modulo" ,ButtonType.CLOSE );
    		//Alert et= parle.show();
    		 parle.show();
    		 return;
    		
        	
        	}else {
        		this.clmod.inslientdao(new CLIENTE_Bean(Txf_nome.getText().toString(), Txf_cognome.getText().toString(), Txf_telefonocasa.getText().toString() ,Txf_telefonocellulare.getText().toString(), Txf_email.getText().toString(), Txf_indirizzo.getText().toString()));
        		return;
        	}
    }

    @FXML
    void Handler_cancel(ActionEvent event) {
    	
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/prj/p1.fxml"));
	        Stage primStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        Scene scene = new Scene(loader.load());
	        primStage.setScene(scene);
	    }catch (IOException io){
	        io.printStackTrace();
	    }
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Txf_cognome != null : "fx:id=\"Txf_cognome\" was not injected: check your FXML file 'ANAGRAFICA_CLIENT.fxml'.";
        assert Txf_nome != null : "fx:id=\"Txf_nome\" was not injected: check your FXML file 'ANAGRAFICA_CLIENT.fxml'.";
        assert Txf_indirizzo != null : "fx:id=\"Txf_indirizzo\" was not injected: check your FXML file 'ANAGRAFICA_CLIENT.fxml'.";
        assert Txf_email != null : "fx:id=\"Txf_email\" was not injected: check your FXML file 'ANAGRAFICA_CLIENT.fxml'.";
        assert Txf_telefonocellulare != null : "fx:id=\"Txf_telefonocellulare\" was not injected: check your FXML file 'ANAGRAFICA_CLIENT.fxml'.";
        assert Txf_telefonocasa != null : "fx:id=\"Txf_telefonocasa\" was not injected: check your FXML file 'ANAGRAFICA_CLIENT.fxml'.";
        assert Dtp_datadinascita != null : "fx:id=\"Dtp_datadinascita\" was not injected: check your FXML file 'ANAGRAFICA_CLIENT.fxml'.";
        assert Btn_invio != null : "fx:id=\"Btn_invio\" was not injected: check your FXML file 'ANAGRAFICA_CLIENT.fxml'.";
        assert Btn_cancel != null : "fx:id=\"Btn_cancel\" was not injected: check your FXML file 'ANAGRAFICA_CLIENT.fxml'.";

        
        //-------------------------------------------------------------------------------------------------------------------
        
        Txf_cognome.clear();
        Txf_email.clear();
        Txf_indirizzo.clear();
        Txf_nome.clear();
        Txf_telefonocasa.clear();
        Txf_telefonocellulare.clear();
        
    }

	public void setclientmodel(CLIENT_model CLIENTMODEL) {
		// TODO Auto-generated method stub
		this.clmod=CLIENTMODEL;
	}
}
