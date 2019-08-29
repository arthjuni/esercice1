package Model.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.CLIENTE_Bean;
import Model.connexiondb;

public class CLIENT_Dao {
	
	String sql;
	List<CLIENTE_Bean>insereAnagrafica=new ArrayList<CLIENTE_Bean>();
	
	public List<CLIENTE_Bean> liredb(CLIENTE_Bean p) {
		sql="insert into inserannagrafa (cognome,nome,indirizzo,telefonocasa,telefonocellulare,email,datanascita)values(?,?,?,?,?,?,?)";
		
		try {
			Connection conn=connexiondb.getconnection();
			PreparedStatement prepa=conn.prepareStatement(sql);
			
		
			 
		//prepa.setString(1, p.getCodfiscale());
			prepa.setString(4, p.getCognome());
			prepa.setString(2, p.getNome());
			prepa.setString(3, p.getIndirizzo());
		prepa.setString(1, p.getTelefonocasa());
		prepa.setString(5, p.getTelefonocellulare());
		prepa.setString(6, p.getEmail());
		prepa.setDate(7, p.getDatanascita());
		
		
		
		
		
			 prepa.executeUpdate();
			 
			// insereAnagrafica.add(p);
			 
			conn.close();
			
		} catch (SQLException e) {
			
			System.err.println("ajunto di utente non è andato a bon termine ");
            throw new RuntimeException(e);
            
           // return false;
			// TODO: handle exception
		}
		
		
		 return insereAnagrafica;
		
	}

}
