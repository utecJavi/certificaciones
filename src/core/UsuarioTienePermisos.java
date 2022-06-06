package core;

import java.util.List;

public class UsuarioTienePermisos {

	
	private Integer id;
	private Usuario usuario;
	private List<Permisos> permisosCollection;
	
	public UsuarioTienePermisos() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioTienePermisos(Integer id, Usuario usuario, List<Permisos> permisosCollection) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.permisosCollection = permisosCollection;
	}





	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Permisos> getPermisosCollection() {
		return permisosCollection;
	}

	public void setPermisosCollection(List<Permisos> permisosCollection) {
		this.permisosCollection = permisosCollection;
	}
	
}
