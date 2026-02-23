import java.util.ArrayList;

/* 
    Estrucuta ArrayList
    -Lista -> tamaño dinámica
    ArrayList<Libro>
    add() -insertar en el arraylist
    get - obtener la información bajo un indice
    set() - actualizar
    remove() - quitar/eliminar el elemento
*/
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

    public void buscarGenero(String genero){
        for (int i=0; i<this.bibliografia.size();i++) {
            Libro libro_i = bibliografia.get(i);
            Autor autor_i = libro_i.getAutor();
            if (autor_i.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(libro_i.info());
            }

        }
    }
}