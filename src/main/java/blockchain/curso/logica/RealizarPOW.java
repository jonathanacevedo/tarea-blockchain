package blockchain.curso.logica;

import java.security.NoSuchAlgorithmException;
import java.util.Random;
import org.apache.commons.codec.digest.DigestUtils;

public class RealizarPOW {

	public static Long obtenerNonce(String transaccionEnCurso) throws NoSuchAlgorithmException {

		Long nonce = null; 
		Random rand = new Random();
		
		while (true) {
			
			nonce = rand.nextLong();			
			String sha256hex = DigestUtils.sha256Hex(transaccionEnCurso+nonce);
			
			System.out.println(sha256hex);

			if (sha256hex.substring(0, 5).equals("00000")) {
				
				System.out.println(sha256hex);
				break;
			}
		}
		
		return nonce;

	}

}
