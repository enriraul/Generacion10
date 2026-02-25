import java.io.BufferedReader;  //io = input output
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ManejoArchivos{

    public ArrayList<Autor> CargarAutores(String archivoAutores ){
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

    public void CargarLibros(String rutaAutores, String rutaLibros, Biblioteca biblioteca){
        ArrayList<Autor> autores = this.CargarAutores(rutaAutores);
        try (BufferedReader br = new BufferedReader(new FileReader(rutaLibros))){
            while((line = br.readLine())!=null){
    
    }

}