public class Main{
    public static void main(String[] args) {

        String rutaAutores = "autores_fantasia_scifi.csv";
        String rutaLibros = "libros_fantasia_scifi.csv";
        Biblioteca biblioteca = new Biblioteca();
        ManejoArchivos  ma = new ManejoArchivos();
        ma.CargarLibros(rutaAutores, rutaLibros, biblioteca);
        biblioteca.mostrarObrasAutor("J.R.R. Tolkien");
        ma.GenerarObrasAutor("J.R.R. Tolkien", biblioteca);

        /*
        
            El método de escritura en donde describa todas las 
            obras de un autor en especifico.

            Inicio 9:33
            Finalizaremos: 9:48
        */


        /*
            Actividad:
            Crear un método que devuelva todas las publicaciones de un 
            autor en especifico.
        
        */
    }
}