public abstract class  Contactos{
    private String nombre;
    private String apellido;
    private String correo;
    private String numero;

    public Contactos(String nombre, String apellido, String correo, String numero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero = numero;
    }

    //Métodos Get

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getCorreo(){
        return this.correo;
    }
    public String getNumero(){
        return this.numero;
    }

    //Métodos set

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setCorreo(String correo){
        this.correo =correo;
    }
    public void setNumero(String numero){
        this.numero =numero;
    }
    public abstract void info();
}