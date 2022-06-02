package modelo;

import java.sql.*;

public class Conexion {

	Connection miConexion=null;
	
	public Conexion() {
		
		
		
	}
	
	public Connection dameConexion() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			miConexion = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "stefi");
			
		}catch(Exception e) {
			
		}
		
		return miConexion;
	}
}
