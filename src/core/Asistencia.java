package core;

public class Asistencia extends Eventos{


	private String tipoDeAsistencia;
	
	public Asistencia() {
		// TODO Auto-generated constructor stub
	}

	
	public Asistencia(String tipoDeAsistencia) {
		super();
		this.tipoDeAsistencia = tipoDeAsistencia;
	}


	public String getTipoDeAsistencia() {
		return tipoDeAsistencia;
	}

	public void setTipoDeAsistencia(String tipoDeAsistencia) {
		this.tipoDeAsistencia = tipoDeAsistencia;
	}

	
}
