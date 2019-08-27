/**
 * Sample Skeleton for 'RISULTA_RICERCA_VIDEO.fxml' Controller Class
 */

package Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class RISULTA_RICERCA_VIDEO_control {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Ahp_listadeifilm"
    private AnchorPane Ahp_listadeifilm; // Value injected by FXMLLoader

    @FXML // fx:id="Tblv_listadeifilm"
    private TableView<?> Tblv_listadeifilm; // Value injected by FXMLLoader

    @FXML // fx:id="Tbc_title"
    private TableColumn<?, ?> Tbc_title; // Value injected by FXMLLoader

    @FXML // fx:id="Tbc_genere"
    private TableColumn<?, ?> Tbc_genere; // Value injected by FXMLLoader

    @FXML // fx:id="Tbc_duratta"
    private TableColumn<?, ?> Tbc_duratta; // Value injected by FXMLLoader

    @FXML // fx:id="Tbc_select"
    private TableColumn<?, ?> Tbc_select; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Ahp_listadeifilm != null : "fx:id=\"Ahp_listadeifilm\" was not injected: check your FXML file 'RISULTA_RICERCA_VIDEO.fxml'.";
        assert Tblv_listadeifilm != null : "fx:id=\"Tblv_listadeifilm\" was not injected: check your FXML file 'RISULTA_RICERCA_VIDEO.fxml'.";
        assert Tbc_title != null : "fx:id=\"Tbc_title\" was not injected: check your FXML file 'RISULTA_RICERCA_VIDEO.fxml'.";
        assert Tbc_genere != null : "fx:id=\"Tbc_genere\" was not injected: check your FXML file 'RISULTA_RICERCA_VIDEO.fxml'.";
        assert Tbc_duratta != null : "fx:id=\"Tbc_duratta\" was not injected: check your FXML file 'RISULTA_RICERCA_VIDEO.fxml'.";
        assert Tbc_select != null : "fx:id=\"Tbc_select\" was not injected: check your FXML file 'RISULTA_RICERCA_VIDEO.fxml'.";

    }
}

