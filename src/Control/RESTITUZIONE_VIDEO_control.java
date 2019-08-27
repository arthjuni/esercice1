/**
 * Sample Skeleton for 'RESTITUZIONE_VIDEO.fxml' Controller Class
 */

package Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class RESTITUZIONE_VIDEO_control {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Ckb_cattivostato"
    private CheckBox Ckb_cattivostato; // Value injected by FXMLLoader

    @FXML // fx:id="Cob_selectionclient"
    private ComboBox<?> Cob_selectionclient; // Value injected by FXMLLoader

    @FXML // fx:id="Txf_addebitoclient"
    private TextField Txf_addebitoclient; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_conferma"
    private Button Btn_conferma; // Value injected by FXMLLoader

    @FXML
    void Handler_cattivostato(ActionEvent event) {

    }

    @FXML
    void Handler_conferma(ActionEvent event) {

    }

    @FXML
    void Handler_selectionclient(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Ckb_cattivostato != null : "fx:id=\"Ckb_cattivostato\" was not injected: check your FXML file 'RESTITUZIONE_VIDEO.fxml'.";
        assert Cob_selectionclient != null : "fx:id=\"Cob_selectionclient\" was not injected: check your FXML file 'RESTITUZIONE_VIDEO.fxml'.";
        assert Txf_addebitoclient != null : "fx:id=\"Txf_addebitoclient\" was not injected: check your FXML file 'RESTITUZIONE_VIDEO.fxml'.";
        assert Btn_conferma != null : "fx:id=\"Btn_conferma\" was not injected: check your FXML file 'RESTITUZIONE_VIDEO.fxml'.";

    }
}
