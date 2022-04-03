package ReservasPista;

public class Cliente {
    //Atributos
    private String numSocio;
    private String nombre;
    private String horaReserva;
    
    //Constructores
    public Cliente() {
    }

    public Cliente(String numSocio, String nombre, String horaReserva) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.horaReserva = horaReserva;
    }

    //Getters y Setters
    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    
    

}
