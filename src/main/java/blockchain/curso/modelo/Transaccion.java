package blockchain.curso.modelo;

import java.util.Date;

public class Transaccion {
	
	private String origen;
	private String destino;
	private Date fecha;
	private Long valor;
	
	
	public Transaccion(String origen, String destino, Long valor, Date fecha) {
		this.origen = origen;
		this.destino = destino;
		this.valor = valor;
		this.fecha = fecha;
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


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
