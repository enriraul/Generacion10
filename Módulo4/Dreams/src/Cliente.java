public class Cliente {

    private String nombre;
    private String correo;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }
    public String getCorreo() {
        return this.correo;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método info()
    public String info() {
        return "Cliente: " + this.nombre + " | Correo: " + this.correo;
    }
}