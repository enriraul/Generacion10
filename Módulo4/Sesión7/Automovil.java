public class Automovil extends Vehiculo{
    private int nPuertas;
    private String transmision;

    public Automovil(String modelo, String marca, 
    int año, String matricula, String color, 
    int nPuertas, String transmision){
        super(modelo,marca, año, matricula, color);
        
    }

    public String info(){
        String mensajeInfo = String.format("""
        
        
        """, this.());
    }

    /*

        Motocicletas
        -Cilindrada
        -TipoModelo
        -TotalPasajeros

        ArrayList Estacionamiento
    
    */
}