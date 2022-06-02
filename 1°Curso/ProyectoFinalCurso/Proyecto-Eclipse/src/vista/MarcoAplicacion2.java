package vista;

import java.awt.*;
import javax.swing.*;
import controlador.*;


public class MarcoAplicacion2  extends JFrame{
	
	public MarcoAplicacion2(){
		
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
		
		add(botonConsulta, BorderLayout.SOUTH);
		
		botonConsulta.addActionListener(new ControladorBotonEjecuta(this));
	
		addWindowListener(new ControladorCargarMenus(this));
}


public JComboBox estado;

public JComboBox id_pais;

public JTextArea resultado;	

}