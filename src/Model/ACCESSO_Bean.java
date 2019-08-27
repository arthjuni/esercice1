package Model;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class ACCESSO_Bean {
	
     private ACCESSO_model messagio;
	/*utente */private String utente;
	/*password*/private String password;
	
	
	public String getUtente() {
		return utente;
	}
	public void setUtente(String utente) {
		
		if (utente==null) {
			//messagio.messagio("lei deve inserire un utente");
			System.out.println("pas utente");
			return;
		}else {
		
			this.utente = utente;
		}
	}
	
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (password.equals(null)) {
			messagio.messagio("lei deve inserire una password");
			return;
		}else {
		
			this.password = password;
		}
		
		
	}
	public ACCESSO_Bean(String utente, String password) {
		super();
		this.utente = utente;
		this.password = password;
	}
	public ACCESSO_Bean() {
		super();
	}
	@Override
	public String toString() {
		return "ACCESSO_Bean : utente=" + utente + ", password=" + password + "";
	}
	
	
	
	
	
	
}
