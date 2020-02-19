package blockchain.curso.logica;

import java.util.List;

import blockchain.curso.modelo.Bloque;
import blockchain.curso.modelo.Body;
import blockchain.curso.modelo.Header;
import blockchain.curso.modelo.Transaccion;

public class FabricaBloque {
	
	private FabricaBloque() {}

	public static Bloque construirBloque(String hashPrevio, String hashRoot, List<Transaccion> transacciones, Bloque bloqueAnterior) {
		
		Header header = new Header(hashPrevio, hashRoot);
		Body body = new Body(transacciones);
		
		return new Bloque(header, body, bloqueAnterior);
	}
	
}
