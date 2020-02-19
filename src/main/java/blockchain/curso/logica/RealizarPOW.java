package blockchain.curso.logica;

import java.security.NoSuchAlgorithmException;
import java.util.Random;
import org.apache.commons.codec.digest.DigestUtils;

import blockchain.curso.modelo.Bloque;

public class RealizarPOW {
	
	private RealizarPOW() {}

	public static String obtenerHash(Bloque bloque) throws NoSuchAlgorithmException {

		Long nonce = null; 
		Random rand = new Random();
		String bloqueHash;
		
		while (true) {
			nonce = rand.nextLong();	
			bloque.getHeader().setNonce(nonce);
			String sha256hex = DigestUtils.sha256Hex(bloque.toString());
			
			System.out.println(sha256hex);

			if (sha256hex.substring(0, 3).equals("000")) {
				bloqueHash = sha256hex;
				break;
			}
		}
		
		return bloqueHash;
	}

}
