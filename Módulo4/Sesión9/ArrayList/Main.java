import java.util.Scanner;


public class Main{

    public static Contactos AgregarContacto(Scanner sc){
        String nombre = sc.nextLine();
        String apellido = sc.nextLine();
        String correo = sc.nextLine();
        String numero = sc.nextLine();
        String tipoContacto = sc.nextLine();

        if(tipoContacto.equalsIgnoreCase("laboral")){
            String cargo = sc.nextLine();
            String empresa = sc.nextLine();            
            ContactosLaborales cl = new ContactosLaborales(nombre, apellido, correo, numero,tipoContacto,cargo, empresa);
            return cl;
        }
        else{
            String alias = sc.nextLine();
            String redes = sc.nextLine();
            ContactosPersonales cp = new ContactosPersonales(nombre, apellido, correo, numero,tipoContacto,alias, redes);
            return cp;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int desicion;
        String menu = 
        """ 
            1.- Agregar contactos
            2.- Desglozar contactos
            3.- Modificar contactos
            4.- Eliminar contactos
            5.- Salir
        """;

        String modificar =
        """
            1.- Modificar nombre
            2.- Modificar apellido
            3.- Modificar correo
            4.- Modificar numero
            5.- Modificar %s
            6.- Modificar %s
            7.- Cancelar
        """;

        do { 
           System.out.println(menu); 
           desicion = sc.nextInt();
           switch(desicion){
                case 1:
                    Contactos contacto = AgregarContacto(sc);
                    agenda.agregarContacto(contacto);
                    break;
                case 2:
                    //Solicitar al usuario el tipo de dato: ambos, laborales, personales
                    String tipoContacto = sc.nextLine();
                    agenda.mostrarAgenda(tipoContacto);
                    break;
                case 3:
                    //Solicitar al usuario el tipo de usuario: laborales, personales (modificar)
                    tipoContacto = sc.nextLine();
                    String dato1, dato2;
                    int modDesicion;
                    if (tipoContacto.equalsIgnoreCase("personales")) {
                        dato1 = "alias";
                        dato2 = "redes";
                    }
                    else{
                        dato1 = "empresa";
                        dato2 = "cargo";
                    }
                    do { 
                        System.out.println(String.format(modificar,dato1,dato2));
                        modDesicion = sc.nextInt();
                        switch(modDesicion){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4: 
                                break;
                            case 5:
                                System.out.println("Ingrese el/la "+dato1+" del contacto: "); 
                                break;
                            case 6: 
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Opción inválida");
                                break;
                        }
                        
                    } while (modDesicion!=7);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Muchas gracias, vuelva pronto");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
           }
        } while (desicion!=5);


    }
}