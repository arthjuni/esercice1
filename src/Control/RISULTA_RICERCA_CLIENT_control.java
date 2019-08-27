/**
 * Sample Skeleton for 'RISULTA_RICERCA_CLIENT.fxml' Controller Class
 */

package Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class RISULTA_RICERCA_CLIENT_control {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Tbl_client"
    private TableColumn<?, ?> Tbl_client; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Tbl_client != null : "fx:id=\"Tbl_client\" was not injected: check your FXML file 'RISULTA_RICERCA_CLIENT.fxml'.";

    }
}
