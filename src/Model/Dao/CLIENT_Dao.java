package Model.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import Model.CLIENTE_Bean;
import Model.connexiondb;

public class CLIENT_Dao {
	
	String sql;
	
	public CLIENTE_Bean liredb(CLIENTE_Bean p) {
		sql="insert into cliente (codfiscale,nome,cognome Telefonocasa,telefonocellulare,email,datanascita,tipo,indirizzo)values(?,?,?,?,?,?,?,?,?)";
		
		try {
			Connection conn=connexiondb.getconnection();
			PreparedStatement prepa=conn.prepareStatement(sql);
		/*	prepa.setString(1,p.getCodfiscale() );
			prepa.setString(2, p.getNome());
			prepa.setString(3, p.getCognome());
			prepa.setString(4, p.getTelefonocasa());
			prepa.setString(5, p.getTelefonocellulare());
			prepa.setString(6, p.getEmail());
			prepa.setDate(7, (Date) p.getDatanascita());
			 prepa.setString(8, p.getIndirizzo());*/
			 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return null;
	}

}
