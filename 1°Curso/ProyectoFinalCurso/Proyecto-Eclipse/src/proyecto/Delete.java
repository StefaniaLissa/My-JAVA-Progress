package proyecto;

//IMPORTAR LIBRERIA
import java.sql.*;
public class Delete {

	public static void main(String[] args) {
		try {

			// 1.CREAR CONEXION
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection miConexion = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "stefi");

			//2.CREAR STATEMENT
			Statement miStatement = miConexion.createStatement();
			
			//3.EJECUTAR SQL
			miStatement.executeUpdate(
					"Insert into ordenes (id_orden,id_clientes,estado_orden,id_vendedor,fecha_orden) "
					+ "values (107,18,'Shipped',60,to_date('01-FEB-20','DD-MON-RR'))");
			
			System.out.println("DATOS INSERTADOS CORRECTAMENTE");
			
			//4.RECORRER EL RESULTSET

			ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM ORDENES WHERE ID_ORDEN=107");
			
			while (miResultSet.next()) {
					System.out.print(miResultSet.getString(1)+' '+miResultSet.getString(2)+' '+
							miResultSet.getString(3)+' '+miResultSet.getString(4)+' '+
							miResultSet.getString(5));
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