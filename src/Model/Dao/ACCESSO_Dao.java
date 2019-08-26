package Model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.ACCESSO_Bean;
import Model.ACCESSO_model;
import Model.connexiondb;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import javafx.scene.control.Alert.AlertType;

public class ACCESSO_Dao {
	
	
	private String sql="select * from accesso where utente=? and password=?";
	
	private List<ACCESSO_Bean> result =new ArrayList<ACCESSO_Bean>();
	
	
public void messagio(String msg) {
		
		Alert parle=new Alert(AlertType.ERROR, msg ,ButtonType.CLOSE );
		//Alert et= parle.show();
		 parle.show();
		
	}
	
public List<ACCESSO_Bean> accessodb(String ut,String pswd) {	
	
	
	try {
		Connection Conn=connexiondb.getconnection();
		
		PreparedStatement prepa= Conn.prepareStatement(sql);
		prepa.setString(1, ut);
		prepa.setString(2, pswd);
		
		ResultSet resul=prepa.executeQuery();
		
		if (resul.next()) {
			ACCESSO_Bean c=new ACCESSO_Bean(resul.getString("utente"),resul.getString("password"));
			result.add(c);
			
			
			
			Conn.close();
			prepa.close();
			
		} else {
			
			messagio("lei deve inserire una password e un utente giusto");
			//System.out.println("lei deve inserire una password e un utente giusto");
		}
		
	} catch (SQLException e) {
		// TODO: handle exception
		System.err.println("non accesso alla tabella");
		throw new RuntimeException(e);
		
	}
	
	
	
return result;
}

}
