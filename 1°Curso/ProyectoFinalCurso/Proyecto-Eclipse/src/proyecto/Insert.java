package proyecto;

//IMPORTAR LIBRERIA
import java.sql.*;
public class Insert {

	public static void main(String[] args) {
		try {

			// 1.CREAR CONEXION
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection miConexion = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "stefi");

			miConexion.setAutoCommit(false);
			miConexion.rollback();
			
			//2.PREPARAR CONSULTA
			PreparedStatement miStatement = miConexion.prepareStatement("SELECT * FROM EMPLEADOS WHERE ID_MANAGER=? AND PUESTO=?");
	
			
			
			//3.ESTABLECER PARÁMETROS DE CONSULTA
			
			miStatement.setInt(1, 4);
			miStatement.setString(2, "Programmer");
			
			
			//4.RECORRER EL RESULTSET
			
			ResultSet miResultSet = miStatement.executeQuery();
			
			while (miResultSet.next()) {
					System.out.println(miResultSet.getString(1)+' '+miResultSet.getString(2)+' '+
							miResultSet.getString(3)+' '+miResultSet.getString(4)+' '+
							miResultSet.getString(5)+' '+miResultSet.getString(6)+' '+
							miResultSet.getString(7)+' '+miResultSet.getString(8));
			}
					
			//REUTILIZACION DE LA CONSULTA PREPARADA SQL
			
			System.out.println("Reutilizacion");
			
			miStatement.setInt(1, 49);
			miStatement.setString(2, "Sales Representative");
			
			miResultSet = miStatement.executeQuery();
			
			while (miResultSet.next()) {
					System.out.println(miResultSet.getString(1)+' '+miResultSet.getString(2)+' '+
							miResultSet.getString(3)+' '+miResultSet.getString(4)+' '+
							miResultSet.getString(5)+' '+miResultSet.getString(6)+' '+
							miResultSet.getString(7)+' '+miResultSet.getString(8));
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