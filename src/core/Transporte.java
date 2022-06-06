package core;

public class Transporte extends Eventos{

	private String destinatario;
	
	public Transporte() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Transporte(String destinatario) {
		super();
		this.destinatario = destinatario;
	}


	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	
	
}
