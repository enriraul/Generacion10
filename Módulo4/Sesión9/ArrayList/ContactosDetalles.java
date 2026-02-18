public class ContactosDetalles{
    
    private Contactos contacto;
    private String tipoContacto;

    public ContactosDetalles(Contactos contacto, String tipoContacto){
        this.contacto = contacto;
        this.tipoContacto = tipoContacto;
    }

    public Contactos getContacto(){
        return this.contacto;
    }
    public String getTipoContacto(){
        return this.tipoContacto;
    }
    
    public void setTipoContacto(String tipoContacto){
        this.tipoContacto = tipoContacto;
    }
}