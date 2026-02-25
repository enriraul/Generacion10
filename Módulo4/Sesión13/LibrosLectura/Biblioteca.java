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
}