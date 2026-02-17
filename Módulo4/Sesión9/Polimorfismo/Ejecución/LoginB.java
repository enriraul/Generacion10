public class LoginB extends Login{

    private String biometrico;
    public LoginB(String usuario, String contraseña,String biometrico){
        super( usuario, contraseña);
        this.biometrico = biometrico;
    }
    //Suponemos que existe una función que revisa los biometricos
    @Override
    public boolean Verificar(){
        if(this.usuario.equalsIgnoreCase("root") && this.contraseña.equalsIgnoreCase("admin") 
        && this.biometrico.equalsIgnoreCase("biometrico")){
            return true;
        }
        else{
            return false;
        }
    }
}