/*
    Polimorfismo de Compilación, o más conocido como sobrecarga de
    métodos. Es la aplicación o reutilización de un mismo método
    para ejecutar diferentes procesos entre sí, con la única condición
    que debe existir una diferencia en los parámetro de entrada o
    el tipo de dato de salida. 
*/

public class Figuras{
    public String color;

    public double CalcularArea(double lado){
        return lado*lado;
    }
    public double CalcularArea(double altura, double base, String tipo){
        if(tipo.equalsIgnoreCase("Rectangulo")){
            return altura*base;
        }
        else if (tipo.equalsIgnoreCase("Triangulo")) {
            return base*altura*0.5;
        }
        else{
            return 0; //Aqui faltó algún ejemplo para concluir
        }
    }
}