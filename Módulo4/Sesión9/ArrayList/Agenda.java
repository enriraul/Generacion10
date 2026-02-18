import java.util.ArrayList;

public class Agenda{
    private ArrayList<ContactosDetalles> agenda;

    public Agenda(){
        agenda = new ArrayList<>();
    }

    public void agregarContacto(ContactosDetalles contacto){
        this.agenda.add(contacto);
    }

    public void mostrarAgenda(String tipoContactos){//laborales, personales, ambos
        for (ContactosDetalles contactos_i : agenda) {
            if(tipoContactos.equalsIgnoreCase("laborales")){
                if (contactos_i.getTipoContacto().equalsIgnoreCase("laborales")) {
                    Contactos contacto_i = contactos_i.getContacto();
                    contacto_i.info();
                }
            }
            else if (tipoContactos.equalsIgnoreCase("personales")) {
                if (contactos_i.getTipoContacto().equalsIgnoreCase("personales")) {
                    Contactos contacto_i = contactos_i.getContacto();
                    contacto_i.info();
                }
            }
            else{
                Contactos contacto_i = contactos_i.getContacto();
                System.out.println("Contacto tipo: "+contactos_i.getTipoContacto());
                contacto_i.info();
            }
        }
    }

}