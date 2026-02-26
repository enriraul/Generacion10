public class Main{
    public static void main(String[] args) {

        String rutaAutores = "autores_fantasia_scifi.csv";
        String rutaLibros = "libros_fantasia_scifi.csv";
        Biblioteca biblioteca = new Biblioteca();
        ManejoArchivos  ma = new ManejoArchivos();
        ma.CargarLibros(rutaAutores, rutaLibros, biblioteca);
        biblioteca.mostrarBibliografia();
    }
}