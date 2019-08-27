package Model;

import java.util.List;

import Model.Dao.ACCESSO_Dao;


public class ACCESSO_model {
	


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
