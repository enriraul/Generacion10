public  class Gato extends Animal{



    public Gato(String especie, String fauna, String familia, int edad){
        super(especie, fauna, familia, edad);
    }

    public String AnimalInfo(){
        String mensaje = String.format("""
            Información del animal:
            Especie: %s
            Familia: %s
            Fauna: %s
            Edad: %s
        """,this.especie, this.familia, this.fauna, this.edad);
        return mensaje;
    }


}