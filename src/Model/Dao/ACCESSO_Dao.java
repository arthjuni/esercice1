package Model.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Control.ACCESSO_control;
import Model.ACCESSO_Bean;
import Model.ACCESSO_model;
import Model.connexiondb;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class ACCESSO_Dao {
	
	
	private String sql="select * from viewinfoaccesso where utente=? and password=?";
	
	private List<ACCESSO_Bean> result =new ArrayList<ACCESSO_Bean>();
	//private List<ACCESSO_Bean>resutaperinfo = new ArrayList<ACCESSO_Bean>();
	
	
public void messagio(String msg) {
		
		Alert parle=new Alert(AlertType.ERROR, msg ,ButtonType.CLOSE );
		//Alert et= parle.show();
		 parle.show();
		
	}

 public static String lavoro;
public String cognomelavorator;
public String nomelavorator;
	

	


public List<ACCESSO_Bean> accessodb(String ut,String pswd) {	
	
	
	try {
		Connection Conn=connexiondb.getconnection();
		
		PreparedStatement prepa= Conn.prepareStatement(sql);
		prepa.setString(1, ut);
		prepa.setString(2, pswd);
		
		ResultSet resul=prepa.executeQuery();
		
		if (resul.next()) {
			//ACCESSO_Bean c=new ACCESSO_Bean(resul.getString("utente"),resul.getString("password"));
			//result.add(c);
			
			ACCESSO_Bean c= new ACCESSO_Bean(resul.getString("utente"), resul.getString("password"), resul.getString("nomeP"), resul.getString("cognome"), resul.getString("nome"));
			result.add(c);
			
			 lavoro= resul.getString("nomeP");
			/* lavoro= resul.getString("nomeP");
			 cognomelavorator= resul.getString("cognome");
			 nomelavorator= resul.getString("nome");*/
					
			
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
	
	
	
	
return result ;
}



}
