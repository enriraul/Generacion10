import java.io.BufferedReader;  //io = input output
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivosCSV{
    public static void main(String[] args) {
        String pathFile = "data.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))){
            /*
                Instancia la clase del buffer
                -Instancia al archivo de lectura
                    -Ubicación del archivo

            */
            while((line = br.readLine())!=null){
                String [] elementos = line.split(",");
                /*
                    "12,45,78,34,56,90,23,11,67,89"
                    [12,45,78,34,56,90,23,11,67,89]
                    nombre, apellido, 34, nacionalidad, 40.5
                */
                int edad = Integer.parseInt(elementos[2]);
                double ingresos = Double.parseDouble(elementos[4]);
                System.out.println(line);
            }
            
        } catch (IOException e) {
        }
    }
}