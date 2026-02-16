abstract class Animal{

    /* 
        Clase abstracta es aquella que cuenta con almenos un método abstracto.

        No podemos realizar una instancia a una clase abstracta.
    */

    protected String especie;
    protected String fauna;
    protected String familia;
    protected int edad;

    public Animal(String especie, String fauna, String familia, int edad){
        this.especie = especie;
        this.fauna = fauna;
        this.familia = familia;
        this.edad = edad;
    }


    public abstract String AnimalInfo();
}