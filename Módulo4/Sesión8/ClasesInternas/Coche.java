

public class Coche{
    public String modelo;
    public String marca;
    public String color;

    public Coche(String modelo, String marca, String color){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public class Motor{
        String marca;
        String nSerial;
        int Potencia;

        public Motor(String marca, String nSerial, int Potencia){
            this.marca = marca;
            this.nSerial = nSerial;
            this.Potencia = Potencia;
        }
    }
}