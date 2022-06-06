package core;

public class Materia {

	private Integer id;
	private String nombre;
	private Integer creditos;
	private Docente docente;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Materia(Integer id, String nombre, Integer creditos, Docente docente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.creditos = creditos;
		this.docente = docente;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	
	
	
}
