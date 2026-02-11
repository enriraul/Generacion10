import java.util.Scanner;


public class Main{
    public static Autor DatosAutor(Scanner sc){
        System.out.println("== Datos del autor ==");
        System.out.println("Ingresa el Nombre del Autor");
        String nombre = sc.nextLine();
        System.out.println("Ingresa el Apellido del Autor");
        String apellido = sc.nextLine();
        System.out.println("Ingresa el Genero de las obras Autor");
        String genero = sc.nextLine();
        System.out.println("Ingresa la nacionalidad del Autor");
        String nacionalidad = sc.nextLine();

        return new Autor(nombre, apellido, genero, nacionalidad);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca catalogo;
        int seleccion, cantidad;
        String mensaje = """

            Seleccione alguna de las siguientes opciones:
            1.- Iniciar el catalogo
            2.- Agregar Libro
            3.- Mostrar Catalogo
            4.- Salir
        """;
        do{
            System.out.println(mensaje);
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:
                    do { 
                        System.out.println("Indique el número de libros (este valor debe ser mayor a 0): ");
                        cantidad = sc.nextInt();
                    } while (cantidad>0);
                    catalogo = new Biblioteca(cantidad);
                    break;
                case 2:
                    if (catalogo != null){
                        System.out.println("Es necesario ingresar cada uno de los siguientes datos");
                        Autor autorTemp = DatosAutor(sc);
                        Libro libroTemp = DatosLibro(sc, autorTemp);
                        catalogo.AgregarLibro(libro)
                    }
                    else{
                        System.out.println("Es necesario iniciar el catalogo para poder agregar un libro");
                    }
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Muchas gracias, nos vemos pronto");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        
        }while(seleccion!=4);

    }
}