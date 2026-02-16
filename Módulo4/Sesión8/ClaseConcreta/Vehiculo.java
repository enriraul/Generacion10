public class Vehiculo{
    /*
        Clases concretas: Son aquellas clases que todos
        sus métodos se encuentran definidos, es decir, no existe un 
        método que no realice alguna acción.
    */
    private String modelo;
    private String marca;
    private int año;
    private String matricula;
    private String color;

    public Vehiculo(String modelo, String marca, int año, String matricula, String color){
        this.modelo = modelo;
        this.marca=  marca;
        this.año = año;
        this.matricula = matricula;
        this.color = color;
    }


    public String getModelo(){
        return this.modelo;
    }
    public String getMarca(){
        return this.marca;
    }
    public int getAño(){
        return this.año;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getColor(){
        return this.color;
    }


    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setAño(int año){
        this.año = año;
    }
    public void setMatricula(String Matricula){
        this.matricula = Matricula;   
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getInfo(){
        return String.format("""
        -------------------------
        Modelo: %s
        Marca: %s
        Año: %d
        Matricula: %s
        Color: %s
        """,this.modelo, this.marca, this.año, this.matricula, this.color);

    }

}