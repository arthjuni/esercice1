/**
 * Sample Skeleton for 'RICERCA_CLIENT.fxml' Controller Class
 */

package Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class RICERCA_CLIENT_control {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Ahp_ricerca"
    private AnchorPane Ahp_ricerca; // Value injected by FXMLLoader

    @FXML // fx:id="Txf_ricercaclient"
    private TextField Txf_ricercaclient; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_invio"
    private Button Btn_invio; // Value injected by FXMLLoader

    @FXML
    void Handler_invio(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Ahp_ricerca != null : "fx:id=\"Ahp_ricerca\" was not injected: check your FXML file 'RICERCA_CLIENT.fxml'.";
        assert Txf_ricercaclient != null : "fx:id=\"Txf_ricercaclient\" was not injected: check your FXML file 'RICERCA_CLIENT.fxml'.";
        assert Btn_invio != null : "fx:id=\"Btn_invio\" was not injected: check your FXML file 'RICERCA_CLIENT.fxml'.";

    }
}
