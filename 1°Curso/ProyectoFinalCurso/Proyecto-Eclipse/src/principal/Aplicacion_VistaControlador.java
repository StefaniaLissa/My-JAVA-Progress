package principal;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Aplicacion_VistaControlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mimarco=new Marco_Aplicacion();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Aplicacion extends JFrame{
	
	public Marco_Aplicacion(){
		
		setTitle ("Consulta BBDD");
		
		setBounds(500,300,400,400);
		
		setLayout(new BorderLayout());
		
		JPanel menus=new JPanel();
		
		menus.setLayout(new FlowLayout());
		
		estado=new JComboBox();
		
		estado.setEditable(false);
		
		estado.addItem("Todos");
		
		id_pais=new JComboBox();
		
		id_pais.setEditable(false);
		
		id_pais.addItem("Todos");
		
		resultado= new JTextArea(4,50);
		
		resultado.setEditable(false);
		
		add(resultado);
		
		menus.add(estado);
		
		menus.add(id_pais);	
		
		add(menus, BorderLayout.NORTH);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton botonConsulta=new JButton("Consulta");	
		
		botonConsulta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ejecutaConsulta();
			}
			
		});
		
		
		add(botonConsulta, BorderLayout.SOUTH);
		
		
		
		//CONEXION CON BBDD
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			miConexion = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "stefi");
			
			Statement miStatement = miConexion.createStatement();
	
			//CARGA ID_MANAGER
			
			ResultSet miResultSet = miStatement.executeQuery("SELECT DISTINCT estado FROM ubicaciones");
			
			while (miResultSet.next()) {
					estado.addItem(miResultSet.getString(1));
			}
	
			miResultSet.close();
			
			//CARGA PUESTO
			
			miResultSet = miStatement.executeQuery("SELECT DISTINCT id_pais FROM ubicaciones");
			
			while (miResultSet.next()) {
					id_pais.addItem(miResultSet.getString(1));
			}
	
			miResultSet.close();
			
		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("ClassNotFound: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Error consulta SQL: ");
			e.printStackTrace();
			
		}
		
	}	
	

	private void ejecutaConsulta() {
		
		ResultSet rs=null;
		
		try {
			
			resultado.setText("");
			
			String estados =(String)estado.getSelectedItem();
			
			String id_paises =(String)id_pais.getSelectedItem();
			
			if(!estados.equals("Todos") && id_paises.equals("Todos")) {
			
			enviaConsultaEstado=miConexion.prepareStatement(consultaEstado);
			
			enviaConsultaEstado.setString(1, estados);
			
			rs=enviaConsultaEstado.executeQuery();
			
			} else if(estados.equals("Todos") && !id_paises.equals("Todos")){
				
				enviaConsultaPais=miConexion.prepareStatement(consultaPais);
				
				enviaConsultaPais.setString(1, id_paises);
				
				rs=enviaConsultaPais.executeQuery();
				
			} else if(!estados.equals("Todos") && !id_paises.equals("Todos")) {
				
				enviaConsultaTodos=miConexion.prepareStatement(consultaTodos);
				
				enviaConsultaTodos.setString(1, estados);
				
				enviaConsultaTodos.setString(2, id_paises);
				
				rs=enviaConsultaTodos.executeQuery();
			}
			
			while(rs.next()) {
				resultado.append(rs.getString(1));
				resultado.append(", ");
				resultado.append(rs.getString(2));
				resultado.append(", ");
				resultado.append(rs.getString(3));
				resultado.append(", ");
				resultado.append(rs.getString(4));
				resultado.append(", ");
				resultado.append(rs.getString(5));
				resultado.append(", ");
				resultado.append(rs.getString(6));
				
				resultado.append("\n");
			}
			
		} catch (Exception e) {
			System.out.println("ClassNotFound: " + e.getMessage());
		}
		
	}
	
	private Connection miConexion;
	
	private PreparedStatement enviaConsultaEstado;
	
	private final String consultaEstado="SELECT * FROM ubicaciones WHERE estado=?";
	
	private PreparedStatement enviaConsultaPais;
	
	private final String consultaPais="SELECT * FROM ubicaciones WHERE id_pais=?";
	
	private PreparedStatement enviaConsultaTodos;
	
	private final String consultaTodos="SELECT * FROM ubicaciones WHERE estado=? AND id_pais=?";
	
	private JComboBox estado;
	
	private JComboBox id_pais;
	
	private JTextArea resultado;	
	

	
}

