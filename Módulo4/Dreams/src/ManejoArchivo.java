import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ManejoArchivo{

    public ArrayList<Cliente> CargarCliente(String archivoClientes){
        ArrayList<Cliente> clientes = new ArrayList<>();
        String linea;
        try(BufferedReader br = new BufferedReader(new FileReader(archivoClientes))){
            while((linea =br.readLine())!= null){
                String [] elementos = linea.split(","); //  "\t"
                Cliente cliente = new Cliente(elementos[0],elementos[1]);
                clientes.add(cliente);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return clientes;
    }

}