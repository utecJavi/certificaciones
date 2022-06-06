package core;

import java.util.List;

public class ITR {

	private Integer id;	
	private String nombre;
	private String ubicacion;
	private List<Analista> analistasCollection;
	private List<Carrera> carrerasCollection;
	
	public ITR() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ITR(Integer id, String nombre, String ubicacion, List<Analista> analistasCollection,
			List<Carrera> carrerasCollection) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.analistasCollection = analistasCollection;
		this.carrerasCollection = carrerasCollection;
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
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Analista> getAnalistasCollection() {
		return analistasCollection;
	}
	public void setAnalistasCollection(List<Analista> analistasCollection) {
		this.analistasCollection = analistasCollection;
	}
	public List<Carrera> getCarrerasCollection() {
		return carrerasCollection;
	}
	public void setCarrerasCollection(List<Carrera> carrerasCollection) {
		this.carrerasCollection = carrerasCollection;
	}
	
	
}
