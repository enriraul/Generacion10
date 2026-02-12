public class Automovil extends Vehiculo{
    private int nPuertas;
    private String transmision;

    public Automovil(String modelo, String marca, 
    int año, String matricula, String color, 
    int nPuertas, String transmision){
        super(modelo,marca, año, matricula, color);
        
    }

    public int getnPuertas(){
        return this.nPuertas;
    }
    public String getTransmision(){
        return this.transmision;
    }

    public void setnPuertas(int nPuertas){
        this.nPuertas = nPuertas;
    }
    public void setTransmision(String Transmision){
        this.transmision = Transmision;
    }

    public String info(){
        return String.format("""
            %s
        n. Puertas: %d
        Transmisión: %s
        -------------------------
        """, this.getInfo(),this.nPuertas, this.transmision);
    }

    /*

        Motocicletas
        -Cilindrada
        -TipoModelo
        -TotalPasajeros

        ArrayList Estacionamiento
    
    */
}