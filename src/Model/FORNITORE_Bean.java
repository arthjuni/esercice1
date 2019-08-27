package Model;

import java.util.List;

public class FORNITORE_Bean {
	
	private Integer CodFornitore;
	private List<PUNTOVENDITA_Bean>puntovenditaF;
	private List<VIDEO_Bean>videoF;
	
	public Integer getCodFornitore() {
		return CodFornitore;
	}
	public void setCodFornitore(Integer codFornitore) {
		CodFornitore = codFornitore;
	}
	public List<PUNTOVENDITA_Bean> getPuntovenditaF() {
		return puntovenditaF;
	}
	public void setPuntovenditaF(List<PUNTOVENDITA_Bean> puntovenditaF) {
		this.puntovenditaF = puntovenditaF;
	}
	public List<VIDEO_Bean> getVideoF() {
		return videoF;
	}
	public void setVideoF(List<VIDEO_Bean> videoF) {
		this.videoF = videoF;
	}
	public FORNITORE_Bean() {
		super();
	}
	public FORNITORE_Bean(Integer codFornitore, List<PUNTOVENDITA_Bean> puntovenditaF, List<VIDEO_Bean> videoF) {
		super();
		CodFornitore = codFornitore;
		this.puntovenditaF = puntovenditaF;
		this.videoF = videoF;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodFornitore == null) ? 0 : CodFornitore.hashCode());
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
		FORNITORE_Bean other = (FORNITORE_Bean) obj;
		if (CodFornitore == null) {
			if (other.CodFornitore != null)
				return false;
		} else if (!CodFornitore.equals(other.CodFornitore))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FORNITORE_Bean [CodFornitore=" + CodFornitore + ", puntovenditaF=" + puntovenditaF + ", videoF="
				+ videoF + "]";
	}
	
	
	
	

}
