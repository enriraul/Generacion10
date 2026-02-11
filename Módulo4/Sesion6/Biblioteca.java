public class Biblioteca{
    
    private Libro[] catalogo;
    private int indice = 0;
    private int cantidad;
    /* 
        TipoDato[] variable = new TipoDato(Tamaño)
        a = [1,2,3,4,5,6] 
        a[1]= NuevoValor
    */

    public Biblioteca(int cantidad){
        catalogo = new Libro[cantidad];
        this.cantidad = cantidad;
    }

    public boolean AgregarLibro(Libro libro){
        if(indice<cantidad){
            catalogo[indice] = libro;
            indice++;
            return true;
        }
        else{
            return false;
        }
    }
    public void MostrarLibro(){
        for (Libro libro : catalogo) {
           System.out.println(libro.info()); 
        }
    }
}