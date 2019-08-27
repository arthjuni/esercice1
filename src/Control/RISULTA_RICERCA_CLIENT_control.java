/**
 * Sample Skeleton for 'RISULTA_RICERCA_CLIENT.fxml' Controller Class
 */

package Control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class RISULTA_RICERCA_CLIENT_control {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Tbl_client"
    private TableColumn<?, ?> Tbl_client; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_nuovoclient"
    private Button Btn_nuovoclient; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_home"
    private Button Btn_home; // Value injected by FXMLLoader

    @FXML
    void Handler_Btn_home(ActionEvent event) {
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/prj/p1.fxml"));
	        Stage primStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        Scene scene = new Scene(loader.load());
	        primStage.setScene(scene);
	    }catch (IOException io){
	        io.printStackTrace();
	    }

    }

    @FXML
    void Handler_nuovoclient(ActionEvent event) {
    	
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/ANAGRAFICA_CLIENT.fxml"));
	        Stage primStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        Scene scene = new Scene(loader.load());
	        primStage.setScene(scene);
	    }catch (IOException io){
	        io.printStackTrace();
	    }

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Tbl_client != null : "fx:id=\"Tbl_client\" was not injected: check your FXML file 'RISULTA_RICERCA_CLIENT.fxml'.";
        assert Btn_nuovoclient != null : "fx:id=\"Btn_nuovoclient\" was not injected: check your FXML file 'RISULTA_RICERCA_CLIENT.fxml'.";
        assert Btn_home != null : "fx:id=\"Btn_home\" was not injected: check your FXML file 'RISULTA_RICERCA_CLIENT.fxml'.";

    }
}
