package Model;

import java.util.List;

import Model.Dao.ACCESSO_Dao;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class ACCESSO_model {
	
public Alert messagio(String msg) {
		
		Alert parle=new Alert(AlertType.ERROR, msg ,ButtonType.CLOSE );
		return parle;
		
	}

ACCESSO_Dao beanM;

public ACCESSO_model() {
	super();
	beanM= new ACCESSO_Dao();
}


public List<ACCESSO_Bean>listutpas(String ut,String pswd){
	
	List<ACCESSO_Bean>lista=beanM.accessodb(ut, pswd);
	
	return lista;
}

}
