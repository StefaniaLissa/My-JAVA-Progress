package P11_2;

import java.util.Date;

public class ProductosFrescos extends Productos{
	//Atributos

	//Constructores
	public ProductosFrescos() {
		super();
	}

	public ProductosFrescos(int loteNum, Date fechaCaducidad, Date fechaEnvasado, String paisOrigen) {
		super(loteNum, fechaCaducidad, fechaEnvasado, paisOrigen);
	}

	@Override
	public String toString() {
		return super.toString();
	}	
	
}
