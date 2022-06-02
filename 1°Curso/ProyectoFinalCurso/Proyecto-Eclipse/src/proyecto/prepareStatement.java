package proyecto;

//IMPORTAR LIBRERIA
import java.sql.*;
public class prepareStatement {

	public static void main(String[] args) {
		try {

			// 1.CREAR CONEXION
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection miConexion = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "stefi");

					//2.CREAR STATEMENT
					Statement miStatement = miConexion.createStatement();
			
					miConexion.setAutoCommit(false);
					miConexion.rollback();
					
					//4.RECORRER EL RESULTSET
		
					ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM PRODUCTOS WHERE producto_nombre LIKE '%Samsung%'");
					
					while (miResultSet.next()) {
							System.out.println(miResultSet.getString(1)+' '+miResultSet.getString(2)+' '+
									miResultSet.getString(3)+' '+miResultSet.getString(4));
					}
			
			//3.EJECUTAR SQL
			miStatement.executeUpdate("DELETE PRODUCTOS WHERE producto_nombre LIKE '%Samsung%'");
			
			System.out.println("DATOS MODIFICADOS CORRECTAMENTE");
			
			
					//4.RECORRER EL RESULTSET
					
					ResultSet miResultSet2 = miStatement.executeQuery("SELECT * FROM PRODUCTOS WHERE producto_nombre LIKE '%Samsung%'");
					
					while (miResultSet2.next()) {
							System.out.println(miResultSet2.getString(1)+' '+miResultSet2.getString(2)+' '+
									miResultSet2.getString(3)+' '+miResultSet2.getString(4));
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