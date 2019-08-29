package Model;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class ACCESSO_Bean {
	
     //private ACCESSO_model messagio;
	/*utente */private String utente;
	/*password*/private String password;
	private String lavoro;
	private String cognomelavorator;
	private String nomelavorator;
	
	
	
	public ACCESSO_Bean(String utente, String password, String lavoro, String cognomelavorator, String nomelavorator) {
		super();
		this.utente = utente;
		this.password = password;
		this.lavoro = lavoro;
		this.cognomelavorator = cognomelavorator;
		this.nomelavorator = nomelavorator;
	}
	public ACCESSO_Bean(String lavoro, String cognomelavorator, String nomelavorator) {
		super();
		this.lavoro = lavoro;
		this.cognomelavorator = cognomelavorator;
		this.nomelavorator = nomelavorator;
	}
	public String getLavoro() {
		return lavoro;
	}
	public void setLavoro(String lavoro) {
		this.lavoro = lavoro;
	}
	public String getCognomelavorator() {
		return cognomelavorator;
	}
	public void setCognomelavorator(String cognomelavorator) {
		this.cognomelavorator = cognomelavorator;
	}
	public String getNomelavorator() {
		return nomelavorator;
	}
	public void setNomelavorator(String nomelavorator) {
		this.nomelavorator = nomelavorator;
	}
	public String getUtente() {
		return utente;
	}
	public void setUtente(String utente) {
		
/*HEAD
		if (utente==null) {
=======
		if (utente.isEmpty() ||utente==" ") {
>>>>>>> branch 'master' of https://github.com/arthjuni/esercice1.git
			//messagio.messagio("lei deve inserire un utente");
			System.out.println("pas utente");
			return;
		}else {*/
		
			this.utente = utente;
		//}
	}
	
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		/*if (password.isEmpty()||password ==" ") {
			//messagio.messagio("lei deve inserire una password");
			System.out.println("lei deve inserire una password");
			return;
		}else {*/
		
			this.password = password;
		//}
		
		
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
		return "ACCESSO_Bean : utente=" + getUtente() + ", password=" + getPassword() + "";
	}
	
	
	
	
	
	
}
