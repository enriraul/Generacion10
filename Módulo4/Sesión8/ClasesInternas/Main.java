public class  Main{
    public static void main(String[] args) {
        Coche coche = new Coche("modelo","marca","color");
        Coche.Motor motor =  coche.new Motor("marca","nSerial",1200);
    }

}