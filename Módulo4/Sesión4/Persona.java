public class Persona{
    public String Nombre;
    public String Apellido;
    public int Edad;
    public String Nacionalidad;
    public Boolean MayorEdad;

    /*
    Constructor: Es un método especial único por cada clase, 
    la función principal es la inicialización de la instancia del objeto,
    es decir, dar valores iniciales a las variables.
    
    Sintaxis: 

    public NombreClase(TipoDato Atributos){
    }
    
    */

    public Persona(String Nombre, String Apellido, int Edad, String Nacionalidad, Boolean MayorEdad){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Nacionalidad = Nacionalidad;
        this.MayorEdad= MayorEdad;
    }

    /* 
        Funciones/métodos Sintaxis:

        NivelAcceso TipoDatoSalida NombreMétodo(TipoDato Atributos)
    
        void = no regresa nada

    */

    public void Presentar(){
        String presentar = "Buenas!, soy "+ this.Nombre +" "
        + this.Apellido + " y soy de "+ this.Nacionalidad;
        System.out.println(presentar);
    }

    public String Despedir(){
        String despedida = "Bueno, es tiempo de retirarnos, nos vemos pronto.";
        return despedida;
    }

    public void InformacionPersonal(){
        String informacion = String.format("""
        Nombre: %s
        Apellido: %s
        """, this.Nombre, this.Apellido);
    }
}