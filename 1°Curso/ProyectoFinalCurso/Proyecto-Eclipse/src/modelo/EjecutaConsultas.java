package modelo;
import java.sql.*;

public class EjecutaConsultas {
	
	public EjecutaConsultas() {
		miConexion=new Conexion();
	}

	public ResultSet filtraBBDD(String estados, String id_paises) {
		//pruebas="";
		
		Connection conecta = miConexion.dameConexion();
		
		rs=null;
				
		try {
		
		if (!estados.equals("Todos") && id_paises.equals("Todos")) {
			
			
			enviaConsultaEstado=conecta.prepareStatement(consultaEstado);
			
			enviaConsultaEstado.setString(1, estados);
			
			rs=enviaConsultaEstado.executeQuery();
			
			
		}else if(estados.equals("Todos") && !id_paises.equals("Todos")) {
			
			enviaConsultaId_pais=conecta.prepareStatement(consultaId_pais);
			
			enviaConsultaId_pais.setString(1, id_paises);
			
			rs=enviaConsultaId_pais.executeQuery();
			
		}else {
			
			enviaConsultaTodos=conecta.prepareStatement(consultaTodos);
			
			enviaConsultaTodos.setString(1, estados);
			
			enviaConsultaTodos.setString(2, id_paises);
			
			rs=enviaConsultaTodos.executeQuery();
			
		}
		
		}catch(Exception e){
			
		}
		
		return rs;
		
		//return pruebas;
	}
	
	//private String pruebas;
	
	private Conexion miConexion;
	
	private ResultSet rs;
	
	private PreparedStatement enviaConsultaEstado;
	
	private final String consultaEstado="SELECT * FROM UBICACIONES WHERE ESTADO=?";
	
	private PreparedStatement enviaConsultaId_pais;
	
	private final String consultaId_pais="SELECT * FROM UBICACIONES WHERE id_pais=?";
	
	private PreparedStatement enviaConsultaTodos;
	
	private final String consultaTodos="SELECT * FROM ubicaciones WHERE estado=? AND id_pais=?";
}
