package Model;

import java.util.List;

import Model.Dao.CLIENT_Dao;

public class CLIENT_model {
	
	
	
	
	
	public List<CLIENTE_Bean>inslientdao( CLIENTE_Bean g){
		CLIENT_Dao anadao= new CLIENT_Dao();
		
		List<CLIENTE_Bean>insere=anadao.liredb(g );
		
		return insere;
	}
	

}
