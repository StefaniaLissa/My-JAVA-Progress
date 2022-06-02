package controlador;
import java.awt.event.*;
import modelo.*;
import vista.*;

public class ControladorCargarMenus extends WindowAdapter{
	
	public ControladorCargarMenus(MarcoAplicacion2 elmarco) {
		
		this.elmarco=elmarco;
	}
	
	public void WindowOpened(WindowEvent e) {
		
		obj.ejecutaConsultas();
		
		try {
			
			while(obj.rs.next()) {
				
				elmarco.estado.addItem(obj.rs.getString(1));
				
			}
			
			while(obj.rs2.next()) {
				elmarco.id_pais.addItem(obj.rs2.getString(1));
			}
			
		}catch(Exception e2){
			e2.printStackTrace();
		}
		
	}
	
	CargaMenus obj = new CargaMenus();
	
	private MarcoAplicacion2 elmarco ;
	
}
