package Model;

public class DOCUMENTO_Bean {
	
	private Integer CodDocumento;
	private String firma;
	
	
	public DOCUMENTO_Bean() {
		super();
	}


	public DOCUMENTO_Bean(Integer codDocumento) {
		super();
		CodDocumento = codDocumento;
	}


	public DOCUMENTO_Bean(Integer codDocumento, String firma) {
		super();
		CodDocumento = codDocumento;
		this.firma = firma;
	}


	public Integer getCodDocumento() {
		return CodDocumento;
	}


	public void setCodDocumento(Integer codDocumento) {
		CodDocumento = codDocumento;
	}


	public String getFirma() {
		return firma;
	}


	public void setFirma(String firma) {
		this.firma = firma;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodDocumento == null) ? 0 : CodDocumento.hashCode());
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
		DOCUMENTO_Bean other = (DOCUMENTO_Bean) obj;
		if (CodDocumento == null) {
			if (other.CodDocumento != null)
				return false;
		} else if (!CodDocumento.equals(other.CodDocumento))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "DOCUMENTO_Bean [CodDocumento=" + CodDocumento + ", firma=" + firma + "]";
	}
	
	
	

}
