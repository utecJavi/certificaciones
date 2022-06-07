package core;

public class Analista extends Usuario {

	private Integer id;
	private String tipoDeAsistencia;
	
	
	public Analista() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Analista(Integer id, String tipoDeAsistencia) {
		super();
		this.id = id;
		this.tipoDeAsistencia = tipoDeAsistencia;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoDeAsistencia() {
		return tipoDeAsistencia;
	}
	public void setTipoDeAsistencia(String tipoDeAsistencia) {
		this.tipoDeAsistencia = tipoDeAsistencia;
	}

	
	
	
}
