import java.util.ArrayList;

public class Biblioteca{

    private ArrayList<Libro> bibliografia;

    public Biblioteca(){
        bibliografia = new ArrayList<>();
    }


    //Agregar un libro en la descripción de la bibliografia
    public void agregarLibro(Libro libro){
        bibliografia.add(libro);
    }

    public void mostrarBibliografia(){
        for (Libro libro_i : bibliografia) {
            System.out.println(libro_i.info());
        }
    }

    public void mostrarObrasAutor(String nombreAutor){
        for (Libro libro_i : bibliografia) {
            if (nombreAutor.equalsIgnoreCase(libro_i.getAutor().getNombre()+" "+libro_i.getAutor().getApellido())) {
                System.out.println(libro_i.info());
            }
        }
    }

    public ArrayList<Libro> getObrasAutor(String nombreAutor){
        ArrayList<Libro> obrasAutor = new ArrayList<>();
        for (Libro libro_i : bibliografia) {
            if (nombreAutor.equalsIgnoreCase(libro_i.getAutor().getNombre()+" "+libro_i.getAutor().getApellido())) {
                obrasAutor.add(libro_i);
            }
        }
        return obrasAutor;
    }
}