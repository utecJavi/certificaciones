package core;

import java.util.Date;

public class Acta {

	private int idActa;
	private Date fechaActa;

	public Acta() {
		// TODO Auto-generated constructor stub
	}

	public Acta(int id, Date fecha) {

		this.idActa = id;
		this.fechaActa = fecha;
	}

	public int getIdActa() {
		return idActa;
	}

	public void setIdActa(int idActa) {
		this.idActa = idActa;
	}

	public Date getFechaActa() {
		return fechaActa;
	}

	public void setFechaActa(Date fechaActa) {
		this.fechaActa = fechaActa;
	}

} // fin clase
