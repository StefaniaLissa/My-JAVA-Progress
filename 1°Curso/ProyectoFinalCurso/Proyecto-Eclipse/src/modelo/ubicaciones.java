package modelo;

public class ubicaciones {
	
	private String direccion;
	
	private String codigo_postal;
	
	private String ciudad;
	
	private String estado;
	
	private String id_pais;
	
	public ubicaciones() {
		direccion="";
		codigo_postal="";
		ciudad="";
		estado="";
		id_pais="";
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getId_pais() {
		return id_pais;
	}

	public void setId_pais(String id_pais) {
		this.id_pais = id_pais;
	}
	
	
	
}
