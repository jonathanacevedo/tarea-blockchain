/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package blockchain.curso;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import blockchain.curso.logica.RealizarPOW;
import blockchain.curso.modelo.Bloque;
import blockchain.curso.modelo.Body;
import blockchain.curso.modelo.Header;
import blockchain.curso.modelo.Transaccion;

public class Main {

	public static void main(String args[]) throws NoSuchAlgorithmException {

		System.out.println("Generando Hash256: ");
		
		String hashRoot = "HASHROOT";

		String transaccionEnCurso = "Jonathan";
		
		Long nonce = RealizarPOW.obtenerNonce(transaccionEnCurso);
		
		System.out.println("El nonce es: "+nonce.toString());

		List<Transaccion> transaccionesBloqueUno = new ArrayList<>();
		transaccionesBloqueUno.add(new Transaccion("Cesar", "Jonathan", 40000L));
		transaccionesBloqueUno.add(new Transaccion("Jonathan", "Cesar", 0L));

		Body bodyBloqueUno = new Body(transaccionesBloqueUno);
		Header headerBloqueUno = new Header(null, nonce, hashRoot);
		
		Bloque primerBloque = new Bloque(headerBloqueUno, bodyBloqueUno);

	}

}
