package core;

public class Usuario extends Persona{

	
	private Integer id;
	private String usuario;
	private String contrase�a;
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Usuario(Integer id, String usuario, String contrase�a) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
	
}
