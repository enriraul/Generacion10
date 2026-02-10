public class Banco{

    private String nCuenta;
    private Persona Cliente;
    private float Capital;
    private float Deuda;

    /*
        Constructor
    */
    public Banco(String nCuenta, Persona Cliente, float Capital, float Deuda){
        this.nCuenta = nCuenta;
        this.Cliente = Cliente;
        this.Capital = Capital;
        this.Deuda = Deuda;
    }

    public void setCapital(float Capital){
        this.Capital = Capital;
    }

    public void RetiroCapital(float Cantidad){
        this.Capital -= Cantidad;
    }

    public float getCapital(){
        return this.Capital;
    }


}