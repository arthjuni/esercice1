package Model;

import java.util.Date;

public class CLIENTE_Bean {
	
	private Integer CodeClient  ;
	private String Codfiscale;
	private String  Nome;
	private String Cognome;
	private String Telefonocasa;
	private String Telefonocellulare ;
	private String Email;
	private Date Datanascita;
	private Character tipo;
	private String Indirizzo;
	private DOCUMENTO_Bean documento;
	
	
	public CLIENTE_Bean() {
		super();
	}


	public CLIENTE_Bean(String codfiscale, String nome, String cognome, String telefonocellulare, Date datanascita,
			String indirizzo) {
		super();
		Codfiscale = codfiscale;
		Nome = nome;
		Cognome = cognome;
		Telefonocellulare = telefonocellulare;
		Datanascita = datanascita;
		Indirizzo = indirizzo;
	}


	public CLIENTE_Bean(String codfiscale, String nome, String cognome, String telefonocasa, String telefonocellulare,
			String email, Date datanascita, Character tipo, String indirizzo) {
		super();
		Codfiscale = codfiscale;
		Nome = nome;
		Cognome = cognome;
		Telefonocasa = telefonocasa;
		Telefonocellulare = telefonocellulare;
		Email = email;
		Datanascita = datanascita;
		this.tipo = tipo;
		Indirizzo = indirizzo;
	}


	public CLIENTE_Bean(Integer codeClient, String codfiscale, String nome, String cognome, String telefonocasa,
			String telefonocellulare, String email, Date datanascita, Character tipo, String indirizzo,
			DOCUMENTO_Bean documento) {
		super();
		CodeClient = codeClient;
		Codfiscale = codfiscale;
		Nome = nome;
		Cognome = cognome;
		Telefonocasa = telefonocasa;
		Telefonocellulare = telefonocellulare;
		Email = email;
		Datanascita = datanascita;
		this.tipo = tipo;
		Indirizzo = indirizzo;
		this.documento = documento;
	}


	public Integer getCodeClient() {
		return CodeClient;
	}


	public void setCodeClient(Integer codeClient) {
		CodeClient = codeClient;
	}


	public String getCodfiscale() {
		return Codfiscale;
	}


	public void setCodfiscale(String codfiscale) {
		Codfiscale = codfiscale;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getCognome() {
		return Cognome;
	}


	public void setCognome(String cognome) {
		Cognome = cognome;
	}


	public String getTelefonocasa() {
		return Telefonocasa;
	}


	public void setTelefonocasa(String telefonocasa) {
		Telefonocasa = telefonocasa;
	}


	public String getTelefonocellulare() {
		return Telefonocellulare;
	}


	public void setTelefonocellulare(String telefonocellulare) {
		Telefonocellulare = telefonocellulare;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public Date getDatanascita() {
		return Datanascita;
	}


	public void setDatanascita(Date datanascita) {
		Datanascita = datanascita;
	}


	public Character getTipo() {
		return tipo;
	}


	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}


	public String getIndirizzo() {
		return Indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}


	public DOCUMENTO_Bean getDocumento() {
		return documento;
	}


	public void setDocumento(DOCUMENTO_Bean documento) {
		this.documento = documento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodeClient == null) ? 0 : CodeClient.hashCode());
		result = prime * result + ((Codfiscale == null) ? 0 : Codfiscale.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CLIENTE_Bean other = (CLIENTE_Bean) obj;
		if (CodeClient == null) {
			if (other.CodeClient != null)
				return false;
		} else if (!CodeClient.equals(other.CodeClient))
			return false;
		if (Codfiscale == null) {
			if (other.Codfiscale != null)
				return false;
		} else if (!Codfiscale.equals(other.Codfiscale))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CLIENTE_Bean [CodeClient=" + CodeClient + ", Codfiscale=" + Codfiscale + ", Nome=" + Nome + ", Cognome="
				+ Cognome + ", Telefonocasa=" + Telefonocasa + ", Telefonocellulare=" + Telefonocellulare + ", Email="
				+ Email + ", Datanascita=" + Datanascita + ", tipo=" + tipo + ", Indirizzo=" + Indirizzo
				+ ", documento=" + documento + "]";
	}
	
	
	
	
	
	
	
	

}