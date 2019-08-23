/**
 * Sample Skeleton for 'p1.fxml' Controller Class
 */

package prj;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class p1Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Hbx_noleggio"
    private HBox Hbx_noleggio; // Value injected by FXMLLoader

    @FXML // fx:id="Vbx_noleggio"
    private VBox Vbx_noleggio; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_nuovocliente"
    private Button Btn_nuovocliente; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_ricercaclient"
    private Button Btn_ricercaclient; // Value injected by FXMLLoader

    @FXML // fx:id="Lbl_client"
    private Label Lbl_client; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_ricercavideo"
    private Button Btn_ricercavideo; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_listavideo"
    private Button Btn_listavideo; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_durata"
    private Button Btn_durata; // Value injected by FXMLLoader

    @FXML // fx:id="Txa_noleggio"
    private TextArea Txa_noleggio; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_conferma"
    private Button Btn_conferma; // Value injected by FXMLLoader

    @FXML
    void Handler_conferma(ActionEvent event) {

    }

    @FXML
    void Handler_durata(ActionEvent event) {

    }

    @FXML
    void Handler_nuovocliente(ActionEvent event) {

    }

    @FXML
    void Handler_ricercaclient(ActionEvent event) {

    }

    @FXML
    void Handler_ricercavideo(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Hbx_noleggio != null : "fx:id=\"Hbx_noleggio\" was not injected: check your FXML file 'p1.fxml'.";
        assert Vbx_noleggio != null : "fx:id=\"Vbx_noleggio\" was not injected: check your FXML file 'p1.fxml'.";
        assert Btn_nuovocliente != null : "fx:id=\"Btn_nuovocliente\" was not injected: check your FXML file 'p1.fxml'.";
        assert Btn_ricercaclient != null : "fx:id=\"Btn_ricercaclient\" was not injected: check your FXML file 'p1.fxml'.";
        assert Lbl_client != null : "fx:id=\"Lbl_client\" was not injected: check your FXML file 'p1.fxml'.";
        assert Btn_ricercavideo != null : "fx:id=\"Btn_ricercavideo\" was not injected: check your FXML file 'p1.fxml'.";
        assert Btn_listavideo != null : "fx:id=\"Btn_listavideo\" was not injected: check your FXML file 'p1.fxml'.";
        assert Btn_durata != null : "fx:id=\"Btn_durata\" was not injected: check your FXML file 'p1.fxml'.";
        assert Txa_noleggio != null : "fx:id=\"Txa_noleggio\" was not injected: check your FXML file 'p1.fxml'.";
        assert Btn_conferma != null : "fx:id=\"Btn_conferma\" was not injected: check your FXML file 'p1.fxml'.";

    }
}
