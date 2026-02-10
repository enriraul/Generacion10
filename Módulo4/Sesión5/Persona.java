public class Persona{

    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String IdOficial;

    /*
        Constructor
    */
    public Persona(String Nombre, String Apellido, String Direccion,
    String IdOficial){

        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.IdOficial = IdOficial;
    }

    /* 

        Métodos Get/Set ~ Getter/Setter

        Get - Obtener - Retorna un valor
        Set - Establecer ~ Asignar/Actualizar - No retorna ningún valor

    */

    public String getNombre(){
        return this.Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
}