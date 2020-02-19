package blockchain.curso.modelo;

public class Bloque {
	private Header header;
	private Body body;
	private Bloque bloqueAnterior;
	private Bloque bloqueSiguiente;
	
	public Bloque(Header header, Body body) {
		this.header = header;
		this.body = body;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
	
}
