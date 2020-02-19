package blockchain.curso.modelo;

import java.util.List;

public class Body {
	private List<Transaccion> transacciones;

	public Body(List<Transaccion> transacciones) {
		super();
		this.transacciones = transacciones;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	
	
}
