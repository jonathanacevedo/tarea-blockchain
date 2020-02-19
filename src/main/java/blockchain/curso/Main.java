package blockchain.curso;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import blockchain.curso.logica.FabricaBloque;
import blockchain.curso.logica.RealizarPOW;
import blockchain.curso.modelo.Bloque;
import blockchain.curso.modelo.Transaccion;

public class Main {
	
	private static Logger log = Logger.getLogger("LoggerTarea");
	private static final String JONATHAN = "Jonathan";
	private static final String CESAR = "Cesar";

	public static void main(String args[]) throws NoSuchAlgorithmException {
				
		String hashRoot = "HASHROOT";

		List<Transaccion> transacciones = new ArrayList<>();
		transacciones.add(new Transaccion(CESAR, JONATHAN, 40000L, new Date()));
		transacciones.add(new Transaccion(JONATHAN, CESAR, 0L, new Date()));
		
		Bloque primerBloque = FabricaBloque.construirBloque(null, hashRoot, transacciones, null);
		String hashBloque1 = RealizarPOW.obtenerHash(primerBloque);

		Bloque segundoBloque = FabricaBloque.construirBloque(hashBloque1, hashRoot, transacciones, primerBloque);
		String hashBloque2 = RealizarPOW.obtenerHash(segundoBloque);
		
		Bloque tercerBloque = FabricaBloque.construirBloque(hashBloque2, hashRoot, transacciones, segundoBloque);
		String hashBloque3 = RealizarPOW.obtenerHash(tercerBloque);
		
		Bloque cuartoBloque = FabricaBloque.construirBloque(hashBloque3, hashRoot, transacciones, tercerBloque);

		recorrerCadenaBloques(cuartoBloque);
	}
	
	private static void recorrerCadenaBloques(Bloque bloqueFinal) {
		Bloque bloque = bloqueFinal;
		while(bloque.getBloqueAnterior() != null) {
			log.info(String.format("El Hash del bloque es: %s",bloque.getHeader().getHashPrevio()));
			bloque = bloque.getBloqueAnterior();
		}
	}

}
