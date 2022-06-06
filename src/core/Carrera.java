package core;

public class Carrera {

	
	private Integer id;
	private String nombre;
	private Integer creditosTotales;
	
	public Carrera() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Carrera(Integer id, String nombre, Integer creditosTotales) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.creditosTotales = creditosTotales;
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

	public Integer getCreditosTotales() {
		return creditosTotales;
	}

	public void setCreditosTotales(Integer creditosTotales) {
		this.creditosTotales = creditosTotales;
	}
	
	
}
