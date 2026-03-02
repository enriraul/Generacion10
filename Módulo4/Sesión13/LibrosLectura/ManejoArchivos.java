import java.io.BufferedReader;  //io = input output
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;


public class ManejoArchivos{

    private ArrayList<Autor> CargarAutores(String archivoAutores ){
        ArrayList<Autor> autores = new ArrayList<>();
        String line;
        int bandera =0 ;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoAutores))){
            while((line = br.readLine())!=null){
                String [] elementos = line.split(",");
                if(!elementos[0].equalsIgnoreCase("Nombre")){
                    Autor autor = new Autor(elementos[0],elementos[1],elementos[2],elementos[3]);
                    autores.add(autor);
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        return autores;
    }

    private int getIndexAutor(ArrayList<Autor> autores,String nombreAutor){
        int index = -1;
        for (int i=0; i<autores.size();i++) {
            Autor autor_i = autores.get(i);
            if (nombreAutor.equalsIgnoreCase(autor_i.getNombre()+" "+autor_i.getApellido() )) {
                index = i;
                break;
            }
        }

        return index;
    }

    public void CargarLibros(String rutaAutores, String rutaLibros, Biblioteca biblioteca){
        ArrayList<Autor> autores = this.CargarAutores(rutaAutores);
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(rutaLibros,StandardCharsets.UTF_8))){
            while((line = br.readLine())!=null){
                String [] elementos = line.split(",");
                if(!elementos[0].equalsIgnoreCase("ISBN")){
                    int index = getIndexAutor(autores, elementos[4]);
                    if (index>=0) {
                        String isbn = elementos[0];
                        String nombreObra = elementos[1];
                        String editorial = elementos[2];
                        int año = Integer.parseInt(elementos[3]);
                        Libro libro = new Libro(isbn, nombreObra, año,autores.get(index),editorial);
                        biblioteca.agregarLibro(libro);
                    }
                    else{
                        System.out.println("No se encontro el autor" + elementos[4]);
                    }
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void GenerarObrasAutor(String NombreAutor, Biblioteca bibliografia){
        
        LocalDate today = LocalDate.now();
        String rutaArchivo = NombreAutor+"_registroObra_"+today+".csv";
        ArrayList<Libro> obrasAutor = bibliografia.getObrasAutor(NombreAutor);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo,StandardCharsets.UTF_8,true))){
            bw.write("Nombre del Autor");
            bw.newLine();
            bw.write(NombreAutor);
            bw.newLine();
            bw.newLine();
            bw.write("ISBN, Nombre de la Obra, Editorial, Año");
            bw.newLine();
            for (Libro obra_i : obrasAutor) {
                String obra = obra_i.getISBN()+","+obra_i.getNombreObra()+
                ","+obra_i.getEditorial()+","+obra_i.getAño();
                bw.write(obra);
                bw.newLine();
            }
            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}