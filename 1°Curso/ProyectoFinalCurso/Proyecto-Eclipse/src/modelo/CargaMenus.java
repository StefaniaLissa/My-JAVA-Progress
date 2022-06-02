package modelo;

import java.sql.*;

public class CargaMenus {
	
	public CargaMenus() {
		
		miConexion=new Conexion();
	}
	
	
	 
	public String ejecutaConsultas() {
		
		ubicaciones miubicacion = null;
		
		Connection accesoBBDD=miConexion.dameConexion();
		
		try {
			
			Statement estados = accesoBBDD.createStatement();
			
			Statement id_paises = accesoBBDD.createStatement();
			
			rs=estados.executeQuery("SELECT DISTINCT estado FROM ubicaciones");
			
			rs2=id_paises.executeQuery("SELECT DISTINCT id_pais FROM ubicaciones");
			
			//while(rs.next()) {
				
				rs.previous();
			
				miubicacion= new ubicaciones();
				
				miubicacion.setEstado(rs.getString(1));
				
				miubicacion.setId_pais(rs2.getString(1));
			
				//return miubicacion.getEstado();
			//}
			
		rs.close();
		rs2.close();
		
		accesoBBDD.close();
			
		}  catch(Exception e) {
			
			
			
		}
		
		return miubicacion.getEstado();
	}
	
	/*
	
	public ResultSet ejecutaConsultas() {
		Connection accesoBBDD = miConexion.dameConexion();
		try {
			Statement estados = accesoBBDD.createStatement();
			return rs = estados.executeQuery("SELECT DISTINCT ESTADO FROM UBICACIONES");
		}catch(Exception e){
			
		}
		return null;
	}
*/
	
	public Conexion miConexion;
	
	public ResultSet rs;
	
	public ResultSet rs2;

}
