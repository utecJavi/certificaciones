package core;

import java.util.Date;

public class Persona {

	private Integer ci;
	private String pasaporte;
	private String nombreUno;
	private String nombreDos;
	private String apellidoUno;
	private Date edad;
	private String direccion;
	private String correo;
	private String departamento;
	private Integer telefono;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	
	public Persona(Integer ci, String pasaporte, String nombreUno, String nombreDos, String apellidoUno, Date edad,
			String direccion, String correo, String departamento, Integer telefono) {
		super();
		this.ci = ci;
		this.pasaporte = pasaporte;
		this.nombreUno = nombreUno;
		this.nombreDos = nombreDos;
		this.apellidoUno = apellidoUno;
		this.edad = edad;
		this.direccion = direccion;
		this.correo = correo;
		this.departamento = departamento;
		this.telefono = telefono;
	}




	public Integer getCi() {
		return ci;
	}

	public void setCi(Integer ci) {
		this.ci = ci;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getNombreUno() {
		return nombreUno;
	}

	public void setNombreUno(String nombreUno) {
		this.nombreUno = nombreUno;
	}

	public String getNombreDos() {
		return nombreDos;
	}

	public void setNombreDos(String nombreDos) {
		this.nombreDos = nombreDos;
	}

	public String getApellidoUno() {
		return apellidoUno;
	}

	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}

	public Date getEdad() {
		return edad;
	}

	public void setEdad(Date edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	
}
