package blockchain.curso.modelo;

public class Bloque {
	private Header header;
	private Body body;
	private Bloque bloqueAnterior;
	
	public Bloque(Header header, Body body, Bloque bloqueAnterior) {
		this.header = header;
		this.body = body;
		this.bloqueAnterior = bloqueAnterior;
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

	public Bloque getBloqueAnterior() {
		return bloqueAnterior;
	}

	public void setBloqueAnterior(Bloque bloqueAnterior) {
		this.bloqueAnterior = bloqueAnterior;
	}

	@Override
	public String toString() {
		return "Bloque [header=" + header + ", body=" + body + ", bloqueAnterior=" + bloqueAnterior + "]";
	}
	
}
