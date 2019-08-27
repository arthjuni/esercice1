package Model;

public class LAVORATORE_Bean {
	
	private Integer CodLavoratore;
	private String Nome;
	private String Cognome ;
	private String TipoLavoratore;
	private PUNTOVENDITA_Bean puntovendita;
	public Integer getCodLavoratore() {
		return CodLavoratore;
	}
	public void setCodLavoratore(Integer codLavoratore) {
		CodLavoratore = codLavoratore;
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
	public String getTipoLavoratore() {
		return TipoLavoratore;
	}
	public void setTipoLavoratore(String tipoLavoratore) {
		TipoLavoratore = tipoLavoratore;
	}
	public PUNTOVENDITA_Bean getPuntovendita() {
		return puntovendita;
	}
	public void setPuntovendita(PUNTOVENDITA_Bean puntovendita) {
		this.puntovendita = puntovendita;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodLavoratore == null) ? 0 : CodLavoratore.hashCode());
		result = prime * result + ((puntovendita == null) ? 0 : puntovendita.hashCode());
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
		LAVORATORE_Bean other = (LAVORATORE_Bean) obj;
		if (CodLavoratore == null) {
			if (other.CodLavoratore != null)
				return false;
		} else if (!CodLavoratore.equals(other.CodLavoratore))
			return false;
		if (puntovendita == null) {
			if (other.puntovendita != null)
				return false;
		} else if (!puntovendita.equals(other.puntovendita))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LAVORATORE_Bean [CodLavoratore=" + CodLavoratore + ", Nome=" + Nome + ", Cognome=" + Cognome
				+ ", TipoLavoratore=" + TipoLavoratore + ", puntovendita=" + puntovendita + "]";
	}
	
	

}
