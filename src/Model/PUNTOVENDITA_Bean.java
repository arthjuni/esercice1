package Model;

import java.util.List;

public class PUNTOVENDITA_Bean {
	
    private Integer CodPuntoVendita;
    private String NomeP;
    private String indirizzo;
    private List<LAVORATORE_Bean>lavoratore;
    private List<VIDEO_Bean>videoP;
    private List<FORNITORE_Bean>fornitoreP;
    
    
	public PUNTOVENDITA_Bean(Integer codPuntoVendita, String nomeP, String indirizzo, List<LAVORATORE_Bean> lavoratore,
			List<VIDEO_Bean> videoP, List<FORNITORE_Bean> fornitoreP) {
		super();
		CodPuntoVendita = codPuntoVendita;
		NomeP = nomeP;
		this.indirizzo = indirizzo;
		this.lavoratore = lavoratore;
		this.videoP = videoP;
		this.fornitoreP = fornitoreP;
	}
	public List<VIDEO_Bean> getVideoP() {
		return videoP;
	}
	public void setVideoP(List<VIDEO_Bean> videoP) {
		this.videoP = videoP;
	}
	public List<FORNITORE_Bean> getFornitoreP() {
		return fornitoreP;
	}
	public void setFornitoreP(List<FORNITORE_Bean> fornitoreP) {
		this.fornitoreP = fornitoreP;
	}
	public Integer getCodPuntoVendita() {
		return CodPuntoVendita;
	}
	public void setCodPuntoVendita(Integer codPuntoVendita) {
		CodPuntoVendita = codPuntoVendita;
	}
	public String getNomeP() {
		return NomeP;
	}
	public void setNomeP(String nomeP) {
		NomeP = nomeP;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public List<LAVORATORE_Bean> getLavoratore() {
		return lavoratore;
	}
	public void setLavoratore(List<LAVORATORE_Bean> lavoratore) {
		this.lavoratore = lavoratore;
	}
	public PUNTOVENDITA_Bean() {
		super();
	}
	public PUNTOVENDITA_Bean(Integer codPuntoVendita) {
		super();
		CodPuntoVendita = codPuntoVendita;
	}
	public PUNTOVENDITA_Bean(String nomeP) {
		super();
		NomeP = nomeP;
	}
	public PUNTOVENDITA_Bean(Integer codPuntoVendita, String nomeP, String indirizzo,
			List<LAVORATORE_Bean> lavoratore) {
		super();
		CodPuntoVendita = codPuntoVendita;
		NomeP = nomeP;
		this.indirizzo = indirizzo;
		this.lavoratore = lavoratore;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodPuntoVendita == null) ? 0 : CodPuntoVendita.hashCode());
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
		PUNTOVENDITA_Bean other = (PUNTOVENDITA_Bean) obj;
		if (CodPuntoVendita == null) {
			if (other.CodPuntoVendita != null)
				return false;
		} else if (!CodPuntoVendita.equals(other.CodPuntoVendita))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PUNTOVENDITA_Bean [CodPuntoVendita=" + CodPuntoVendita + ", NomeP=" + NomeP + ", indirizzo=" + indirizzo
				+ ", lavoratore=" + lavoratore + ", videoP=" + videoP + ", fornitoreP=" + fornitoreP + "]";
	}
    
    

}
