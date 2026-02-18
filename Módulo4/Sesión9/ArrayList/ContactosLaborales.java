public class ContactosLaborales extends Contactos {

    private String nombreEmpresa;
    private String cargo;


    /** Constructor vacío */
    //public ContactosLaborales() {}

    /** Constructor completo */
    public ContactosLaborales(String nombre, String apellido,
                               String correo, String numero,String tipoContacto,
                               String nombreEmpresa, String cargo) {
        super(nombre, apellido, correo, numero,tipoContacto);
        this.nombreEmpresa = nombreEmpresa;
        this.cargo         = cargo;
    }


    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    @Override
    public void info() {
        System.out.println("===== Contacto Laboral =====");
        System.out.println("Nombre   : " + getNombre() + " " + getApellido());
        System.out.println("Correo   : " + getCorreo());
        System.out.println("Número   : " + getNumero());
        System.out.println("Empresa  : " + nombreEmpresa);
        System.out.println("Cargo    : " + cargo);
        System.out.println("============================");
    }
}