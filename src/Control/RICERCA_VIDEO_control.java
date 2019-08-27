/**
 * Sample Skeleton for 'RICERCA_VIDEO.fxml' Controller Class
 */

package Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class RICERCA_VIDEO_control {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Btn_invio"
    private AnchorPane Btn_invio; // Value injected by FXMLLoader

    @FXML // fx:id="Txf_titolo"
    private TextField Txf_titolo; // Value injected by FXMLLoader

    @FXML
    void Handler_invio(MouseEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Btn_invio != null : "fx:id=\"Btn_invio\" was not injected: check your FXML file 'RICERCA_VIDEO.fxml'.";
        assert Txf_titolo != null : "fx:id=\"Txf_titolo\" was not injected: check your FXML file 'RICERCA_VIDEO.fxml'.";

    }
}
