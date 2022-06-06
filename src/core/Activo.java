package core;

public class Activo extends Eventos{

	private Boolean habilitado;
	
	public Activo() {
		// TODO Auto-generated constructor stub
	}

	
	public Activo(Boolean habilitado) {
		super();
		this.habilitado = habilitado;
	}


	public Boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	
	
	
}
