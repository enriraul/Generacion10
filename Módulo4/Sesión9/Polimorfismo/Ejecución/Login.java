/* 
    Polimorfismo: Propiedad POO que nos permite 
    adaptar los métodos ya existentes por el mecanismo de herencia
    otorgados por el padre. 

    Polimorfismo de ejecución: Sobreescritura de métodos
*/

public class Login{

    public String usuario;
    public String contraseña;

    public Login(String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public boolean Verificar(){
        if(this.usuario.equalsIgnoreCase("root") && this.contraseña.equalsIgnoreCase("admin")){
            return true;
        }
        else{
            return false;
        }
    }

}