public class Vehiculo{

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

    /*
        Método Get
    */
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


    /*
        Métodos Set 
    */

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

}