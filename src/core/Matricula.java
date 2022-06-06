package paquete.uno;

import java.util.Date;

public class Matricula {

	private Integer id;
	private Date fechaIngreso;
	private Integer notaFinal;
	
	public Matricula() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Matricula(Integer id, Date fechaIngreso, Integer notaFinal) {
		super();
		this.id = id;
		this.fechaIngreso = fechaIngreso;
		this.notaFinal = notaFinal;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Integer notaFinal) {
		this.notaFinal = notaFinal;
	}
	
}
