import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class EscribirCSV{

    public static void main(String[] args) {
        String rutaArchivo = "./LibrosLectura/archivoPrueba.csv";  

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo,StandardCharsets.UTF_8))){
            bw.write("Nombre,Apellido,Nacionalidad");
            bw.newLine();
            bw.write("Enrique,Olguín,Mexicano");
            bw.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}