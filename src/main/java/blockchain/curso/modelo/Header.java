package blockchain.curso.modelo;

public class Header {
	
	private String hashPrevio;
	private Long nonce;
	private String hashRoot;
	
	
	public Header(String hashPrevio, Long nonce, String hashRoot) {
		super();
		this.hashPrevio = hashPrevio;
		this.nonce = nonce;
		this.hashRoot = hashRoot;
	}


	public String getHashPrevio() {
		return hashPrevio;
	}


	public void setHashPrevio(String hashPrevio) {
		this.hashPrevio = hashPrevio;
	}


	public Long getNonce() {
		return nonce;
	}


	public void setNonce(Long nonce) {
		this.nonce = nonce;
	}


	public String getHashRoot() {
		return hashRoot;
	}


	public void setHashRoot(String hashRoot) {
		this.hashRoot = hashRoot;
	}

}
