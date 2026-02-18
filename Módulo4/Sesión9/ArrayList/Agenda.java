import java.util.ArrayList;

public class Agenda{
    private ArrayList<Contactos> agenda;

    public Agenda(){
        agenda = new ArrayList<>();
    }

    public void agregarContacto(Contactos contacto){
        this.agenda.add(contacto);
    }

    public void mostrarAgenda(String tipoContactos){//laborales, personales, ambos
        for (Contactos contactos_i : agenda) {
            if(tipoContactos.equalsIgnoreCase("laborales")){
                if (contactos_i.getTipoContacto().equalsIgnoreCase("laborales")) {
                    contactos_i.info();
                }
            }
            else if (tipoContactos.equalsIgnoreCase("personales")) {
                if (contactos_i.getTipoContacto().equalsIgnoreCase("personales")) {
                    contactos_i.info();
                }
            }
            else{
                System.out.println("Contacto tipo: "+contactos_i.getTipoContacto());
                contactos_i.info();
            }
        }
    }

    public void ActualizarAlias(String alias){
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getTipoContacto().equalsIgnoreCase("personales")){
                ContactosPersonales contacto = (ContactosPersonales)agenda.get(i);
                contacto.setRedes(alias);

                ContactosLaborales contactol = (ContactosLaborales)agenda.get(i);
                contactol.
            }
        }
    }
}