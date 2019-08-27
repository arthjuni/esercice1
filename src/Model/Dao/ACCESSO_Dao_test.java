package Model.Dao;

import Model.ACCESSO_Bean;
import Model.ACCESSO_model;

public class ACCESSO_Dao_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ACCESSO_model test= new ACCESSO_model();
		System.out.println(test.listutpas(" ", " "));
		
		
		ACCESSO_Bean test2= new ACCESSO_Bean();
        test2.setUtente(" ");
        System.out.println(test2.getUtente());
	}

}
