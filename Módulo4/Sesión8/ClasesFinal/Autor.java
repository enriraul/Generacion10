public final class Autor{
    private String Nombre, Apellido, Genero, Nacionalidad;

    public Autor(String Nombre, String Apellido,String Genero,String Nacionalidad){
        this.Nombre = Nombre;
        this.Apellido = Apellido; 
        this.Genero = Genero; 
        this.Nacionalidad = Nacionalidad;
    }

    public String getNombre(){
        return this.Nombre;
    }
    public String getApellido(){
        return this.Apellido;
    }
    public String getGenero(){
        return this.Genero;
    }
    public String getNacionalidad(){
        return this.Nacionalidad;
    }

    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public void setApellido(String Apellido){
        this.Apellido =Apellido;
    }
    public void setGenero(String Genero){
        this.Genero =Genero;
    }
    public void setNacionalidad(String Nacionalidad){
        this.Nacionalidad = Nacionalidad;
    }

    public String info(){
        return String.format("""
        ___________________________
        Autor: %s %s
        Genero: %s
        Nacionalidad: %s
        ___________________________
        """,this.Nombre, this.Apellido, this.Genero, this.Nacionalidad);
    }
}