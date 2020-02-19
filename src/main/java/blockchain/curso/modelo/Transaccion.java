package blockchain.curso.modelo;

public class Transaccion {
	
	private String origen;
	private String destino;
	private Long valor;
	
	
	public Transaccion(String origen, String destino, Long valor) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.valor = valor;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public Long getValor() {
		return valor;
	}


	public void setValor(Long valor) {
		this.valor = valor;
	}

}
