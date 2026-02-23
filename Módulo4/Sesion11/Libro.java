public class Libro{
    
    private String ISBN, NombreObra,editorial;
    private int año;
    private Autor autor;

    public Libro(String ISBN, String NombreObra, int año, Autor autor, String editorial){
        this.ISBN = ISBN;
        this.NombreObra = NombreObra;
        this.año = año;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getISBN(){
        return this.ISBN;
    }
    public String getNombreObra(){
        return this.NombreObra;
    }
    public int getAño(){
        return this.año;
    }
    public Autor getAutor(){
        return this.autor;
    }
    public String getEditorial(){
        return this.editorial;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN; 
    }
    public void setNombreObra(String NombreObra ){
        this.NombreObra = NombreObra;
    }
    public void setAño(int año ){
        this.año = año; 
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial; 
    }

    public String info(){
        return String.format("""
        ___________________________
        ISBN: %s
        Nombre de la obra: %s
        Año: %d
        Editorial: %s
        %s
        """,this.ISBN, this.NombreObra, this.año, this.editorial,this.autor.info());
    }
}