package core;

import java.util.Date;

public class Eventos {

	private Integer id;
	private Date fecha;

	public Eventos() {
		// TODO Auto-generated constructor stub
	}

	public Eventos(Integer id, Date fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
	}

	public void listadoEventosUsuario(Integer idUsuario) {
		System.out.println("Sin implementar");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
