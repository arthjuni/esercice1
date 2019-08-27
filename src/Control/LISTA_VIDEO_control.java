/**
 * Sample Skeleton for 'LISTA_VIDEO.fxml' Controller Class
 */

package Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class LISTA_VIDEO_control {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Acp_listavideo"
    private AnchorPane Acp_listavideo; // Value injected by FXMLLoader

    @FXML // fx:id="Lsv_listavideo"
    private ListView<?> Lsv_listavideo; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Acp_listavideo != null : "fx:id=\"Acp_listavideo\" was not injected: check your FXML file 'LISTA_VIDEO.fxml'.";
        assert Lsv_listavideo != null : "fx:id=\"Lsv_listavideo\" was not injected: check your FXML file 'LISTA_VIDEO.fxml'.";

    }
}
