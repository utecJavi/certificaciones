package core;

import java.util.Date;

public class Justificaciones {
	
	private Integer id;
	private String observaciones;
	private Date fecha;
	
	
	public Justificaciones() {
		// TODO Auto-generated constructor stub
	}


	public Justificaciones(Integer id, String observaciones, Date fecha) {
		super();
		this.id = id;
		this.observaciones = observaciones;
		this.fecha = fecha;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
