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
                    ContactosLaborales contactosl_i = (ContactosLaborales)contactos_i;
                    contactosl_i.info();
                }
            }
            else if (tipoContactos.equalsIgnoreCase("personales")) {
                if (contactos_i.getTipoContacto().equalsIgnoreCase("personales")) {
                    ContactosPersonales contactosp_i = (ContactosPersonales) contactos_i;
                    contactosp_i.info();
                }
            }
            else{
                if (contactos_i.getTipoContacto().equalsIgnoreCase("laborales")) {
                    ContactosLaborales contactosl_i = (ContactosLaborales)contactos_i;
                    contactosl_i.info();
                }
                else{
                    ContactosPersonales contactosp_i = (ContactosPersonales) contactos_i;
                    contactosp_i.info();
                }
            }
        }
    }

    public void ActualizarAlias(String alias){
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getTipoContacto().equalsIgnoreCase("personales")){
                ContactosPersonales contacto = (ContactosPersonales)agenda.get(i);
                contacto.setAlias(alias);
            }
        }
    }

    public void ActualizarRedes(String redes){
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getTipoContacto().equalsIgnoreCase("personales")){
                ContactosPersonales contacto = (ContactosPersonales)agenda.get(i);
                contacto.setRedes(redes);
            }
        }
    }

    public void ActualizarNombreEmpresa(String nombreEmpresa){
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getTipoContacto().equalsIgnoreCase("laborales")){
                ContactosLaborales contacto = (ContactosLaborales)agenda.get(i);
                contacto.setNombreEmpresa(nombreEmpresa);
            }
        }   
    }
    public void ActualizarCargo(String cargo){
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getTipoContacto().equalsIgnoreCase("laborales")){
                ContactosLaborales contacto = (ContactosLaborales)agenda.get(i);
                contacto.setCargo(cargo);
            }
        }
    }
}