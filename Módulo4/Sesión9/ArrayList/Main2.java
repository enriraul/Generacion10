public class Main2{
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contactos contactos = new ContactosPersonales("Nombre","Apellido","Correo","numero","personales","alias","redes");

        ContactosPersonales contactos_p = (ContactosPersonales)contactos;

        ContactosLaborales contactos_l = (ContactosLaborales)contactos;
        System.out.println(contactos_l.getNombreEmpresa());

        agenda.agregarContacto(contactos);
    }
}