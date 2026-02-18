public class ContactosPersonales extends Contactos{
    private String alias;
    private String redes;

    public ContactosPersonales(String nombre, String apellido, String correo, String número, String alias, String redes){
        super( nombre, apellido, correo, número);
        this.alias = alias;
        this.redes = redes;

    }

    public String getAlias(){
        return this.alias;
    }
    public String getRedes(){
        return this.redes;
    }

    public void setAlias(String alias){
        this.alias = alias;
    }
    public void setRedes(String redes){
        this.redes = redes;
    }
    @Override
    public void  info(){
        String mensaje = String.format("""
        Nombre: %s
        Apellido: %s
        Correo: %s
        Número: %s
        Alias: %s
        Redes: %s
        """, getNombre(), getApellido(), getCorreo(), getNumero(), this.alias, this.redes);
        System.out.println(mensaje);
        
    }
}