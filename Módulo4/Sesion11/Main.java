public class Main{
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor = new Autor("John Ronald","Reuel Tolkien","Fantasía","Británico");
        Libro libro = new Libro("978-84450000663","Comunidad del anillo",1954,autor,"Minotauro");
        
        Libro libro2 = new Libro("978-8445009604","Las dos torres",1954,autor,"Minotauro");

        Autor autor2 = new Autor("Stephen","King","Terror","Estadounidense");
        Libro  libro3 = new Libro("978-8445009605","IT",1986, autor2,"Minotauro"); 

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        //biblioteca.mostrarBibliografia();
        biblioteca.buscarGenero("Terror");

        /* 
            Dado un ISBN proporcionado por el usuario actualizaremos el
            nombre del autor del libro, el nombre también es proporcionado
            por el usuario 

        */
    }
}