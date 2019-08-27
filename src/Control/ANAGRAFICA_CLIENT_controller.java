/**
 * Sample Skeleton for 'ANAGRAFICA_CLIENT.fxml' Controller Class
 */

package Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ANAGRAFICA_CLIENT_controller {

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
    void Handler_cancel(ActionEvent event) {

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

    }
}
