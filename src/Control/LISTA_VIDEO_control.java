/**
 * Sample Skeleton for 'LISTA_VIDEO.fxml' Controller Class
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
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LISTA_VIDEO_control {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Acp_listavideo"
    private AnchorPane Acp_listavideo; // Value injected by FXMLLoader

    @FXML // fx:id="Lsv_listavideo"
    private ListView<?> Lsv_listavideo; // Value injected by FXMLLoader

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

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Acp_listavideo != null : "fx:id=\"Acp_listavideo\" was not injected: check your FXML file 'LISTA_VIDEO.fxml'.";
        assert Lsv_listavideo != null : "fx:id=\"Lsv_listavideo\" was not injected: check your FXML file 'LISTA_VIDEO.fxml'.";
        assert Btn_home != null : "fx:id=\"Btn_home\" was not injected: check your FXML file 'LISTA_VIDEO.fxml'.";

    }
}
