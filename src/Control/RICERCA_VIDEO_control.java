/**
 * Sample Skeleton for 'RICERCA_VIDEO.fxml' Controller Class
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RICERCA_VIDEO_control {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Acp_ricercavideo"
    private AnchorPane Acp_ricercavideo; // Value injected by FXMLLoader

    @FXML // fx:id="Txf_titolo"
    private TextField Txf_titolo; // Value injected by FXMLLoader

    @FXML // fx:id="Btn_invio"
    private Button Btn_invio; // Value injected by FXMLLoader

    @FXML
    void Handler_invio(ActionEvent event) {
    	
    	try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/RISULTA_RICERCA_VIDEO.fxml"));
	        Stage primStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        Scene scene = new Scene(loader.load());
	        primStage.setScene(scene);
	    }catch (IOException io){
	        io.printStackTrace();
	    }   	

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Acp_ricercavideo != null : "fx:id=\"Acp_ricercavideo\" was not injected: check your FXML file 'RICERCA_VIDEO.fxml'.";
        assert Txf_titolo != null : "fx:id=\"Txf_titolo\" was not injected: check your FXML file 'RICERCA_VIDEO.fxml'.";
        assert Btn_invio != null : "fx:id=\"Btn_invio\" was not injected: check your FXML file 'RICERCA_VIDEO.fxml'.";

    }
}
