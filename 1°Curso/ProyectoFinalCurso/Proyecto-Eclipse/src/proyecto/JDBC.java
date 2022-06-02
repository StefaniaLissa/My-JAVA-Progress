package proyecto;

//IMPORTAR LIBRERIA
import java.sql.*;
public class JDBC {

	public static void main(String[] args) {
		try {

			// 1.CREAR CONEXION
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection miConexion = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "stefi");

			DatabaseMetaData miMetadata = miConexion.getMetaData();
			ResultSet miResultSet2 = miMetadata.getCatalogs();
			System.out.println("BD del sistema: ");
			while(miResultSet2.next()){
			System.out.println("- "+miResultSet2.getString("TABLE_CAT"));
			}
			
			//5.CERRAR CONEXION
			miConexion.close();
			
		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("ClassNotFound: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Error consulta SQL: ");
			e.printStackTrace();
		}
	}
}
