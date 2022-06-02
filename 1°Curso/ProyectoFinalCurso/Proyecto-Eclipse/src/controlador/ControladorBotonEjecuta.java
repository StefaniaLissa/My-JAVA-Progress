package controlador;

import java.awt.event.*;
import java.sql.*;
import modelo.*;
import vista.*;

public class ControladorBotonEjecuta implements ActionListener{

	public ControladorBotonEjecuta(MarcoAplicacion2 elmarco) {
		this.elmarco=elmarco;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String seleccionEstados=(String)elmarco.estado.getSelectedItem();
		String seleccionid_paises=(String)elmarco.id_pais.getSelectedItem();
		
		resultadoConsulta=obj.filtraBBDD(seleccionEstados, seleccionid_paises);
		
		try {
			
			elmarco.resultado.setText("");
			
			while(resultadoConsulta.next()) {
				
				elmarco.resultado.append(resultadoConsulta.getString(1));
				elmarco.resultado.append(", ");
				elmarco.resultado.append(resultadoConsulta.getString(2));
				elmarco.resultado.append(", ");
				elmarco.resultado.append(resultadoConsulta.getString(3));
				elmarco.resultado.append(", ");
				elmarco.resultado.append(resultadoConsulta.getString(4));
				elmarco.resultado.append(", ");
				elmarco.resultado.append(resultadoConsulta.getString(5));
				elmarco.resultado.append(", ");
				elmarco.resultado.append(resultadoConsulta.getString(6));
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	private MarcoAplicacion2 elmarco;
	
	EjecutaConsultas obj=new EjecutaConsultas();
	
	private ResultSet resultadoConsulta;
}
