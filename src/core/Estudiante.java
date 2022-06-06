package paquete.uno;

public class Estudiante extends Usuario{

	private Integer id;
	private Boolean activo;
	private String generacion;
	private Matricula matricula;
	
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(Integer id, Boolean activo, String generacion, Matricula matricula) {
		super();
		this.id = id;
		this.activo = activo;
		this.generacion = generacion;
		this.matricula = matricula;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public String getGeneracion() {
		return generacion;
	}
	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
}
