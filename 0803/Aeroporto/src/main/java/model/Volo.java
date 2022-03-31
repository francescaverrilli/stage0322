package model;

public class Volo {
	private int idVolo;
	private Aereo aereo;
	private Aeroporto partenza;
	private String dataArrivo;
	private String dataPartenza;
	private int numeroPasseggeri;
	private Aeroporto arrivo;
	
	public Volo(int idVolo, Aereo aereo, Aeroporto partenza, String dataArrivo, String dataPartenza,
			int numeroPasseggeri, Aeroporto arrivo) {
		super();
		this.idVolo = idVolo;
		this.aereo = aereo;
		this.partenza = partenza;
		this.dataArrivo = dataArrivo;
		this.dataPartenza = dataPartenza;
		this.numeroPasseggeri = numeroPasseggeri;
		this.arrivo = arrivo;
	}

	public int getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}

	public Aereo getAereo() {
		return aereo;
	}

	public void setAereo(Aereo aereo) {
		this.aereo = aereo;
	}

	public Aeroporto getPartenza() {
		return partenza;
	}

	public void setPartenza(Aeroporto partenza) {
		this.partenza = partenza;
	}

	public String getDataArrivo() {
		return dataArrivo;
	}

	public void setDataArrivo(String dataArrivo) {
		this.dataArrivo = dataArrivo;
	}

	public String getDataPartenza() {
		return dataPartenza;
	}

	public void setDataPartenza(String dataPartenza) {
		this.dataPartenza = dataPartenza;
	}

	public int getNumeroPasseggeri() {
		return numeroPasseggeri;
	}

	public void setNumeroPasseggeri(int numeroPasseggeri) {
		this.numeroPasseggeri = numeroPasseggeri;
	}

	public Aeroporto getArrivo() {
		return arrivo;
	}

	public void setArrivo(Aeroporto arrivo) {
		this.arrivo = arrivo;
	}

	@Override
	public String toString() {
		return "Volo [idVolo=" + idVolo + ", aereo=" + aereo + ", partenza=" + partenza + ", dataArrivo=" + dataArrivo
				+ ", dataPartenza=" + dataPartenza + ", numeroPasseggeri=" + numeroPasseggeri + ", arrivo=" + arrivo
				+ "]";
	}
	
	
	
	
}
