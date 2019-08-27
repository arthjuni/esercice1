package Model;

import java.util.List;

public class VIDEO_Bean {
	
	private Integer CodVideo;
	private String Regista;
	private String autore;
	private String CasaProdutrie;
	private Integer Durata;
	private String Genere;
	private String Titolo;
	private List<PUNTOVENDITA_Bean>puntovenditaV;
	private List<FORNITORE_Bean>fornitoreV;
	
	public VIDEO_Bean() {
		super();
	}

	public VIDEO_Bean(String genere, String titolo) {
		super();
		Genere = genere;
		Titolo = titolo;
	}

	public VIDEO_Bean(Integer codVideo, String regista, String autore, String casaProdutrie, Integer durata,
			String genere, String titolo, List<PUNTOVENDITA_Bean> puntovenditaV, List<FORNITORE_Bean> fornitoreV) {
		super();
		CodVideo = codVideo;
		Regista = regista;
		this.autore = autore;
		CasaProdutrie = casaProdutrie;
		Durata = durata;
		Genere = genere;
		Titolo = titolo;
		this.puntovenditaV = puntovenditaV;
		this.fornitoreV = fornitoreV;
	}

	public Integer getCodVideo() {
		return CodVideo;
	}

	public void setCodVideo(Integer codVideo) {
		CodVideo = codVideo;
	}

	public String getRegista() {
		return Regista;
	}

	public void setRegista(String regista) {
		Regista = regista;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getCasaProdutrie() {
		return CasaProdutrie;
	}

	public void setCasaProdutrie(String casaProdutrie) {
		CasaProdutrie = casaProdutrie;
	}

	public Integer getDurata() {
		return Durata;
	}

	public void setDurata(Integer durata) {
		Durata = durata;
	}

	public String getGenere() {
		return Genere;
	}

	public void setGenere(String genere) {
		Genere = genere;
	}

	public String getTitolo() {
		return Titolo;
	}

	public void setTitolo(String titolo) {
		Titolo = titolo;
	}

	public List<PUNTOVENDITA_Bean> getPuntovenditaV() {
		return puntovenditaV;
	}

	public void setPuntovenditaV(List<PUNTOVENDITA_Bean> puntovenditaV) {
		this.puntovenditaV = puntovenditaV;
	}

	public List<FORNITORE_Bean> getFornitoreV() {
		return fornitoreV;
	}

	public void setFornitoreV(List<FORNITORE_Bean> fornitoreV) {
		this.fornitoreV = fornitoreV;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodVideo == null) ? 0 : CodVideo.hashCode());
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
		VIDEO_Bean other = (VIDEO_Bean) obj;
		if (CodVideo == null) {
			if (other.CodVideo != null)
				return false;
		} else if (!CodVideo.equals(other.CodVideo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VIDEO_Bean [CodVideo=" + CodVideo + ", Regista=" + Regista + ", autore=" + autore + ", CasaProdutrie="
				+ CasaProdutrie + ", Durata=" + Durata + ", Genere=" + Genere + ", Titolo=" + Titolo
				+ ", puntovenditaV=" + puntovenditaV + ", fornitoreV=" + fornitoreV + "]";
	}
	
	
	
	
	

}
