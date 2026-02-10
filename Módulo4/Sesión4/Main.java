public class Main{
    public static void main(String args[]){
        Persona persona1 = new Persona("Pedro","Perez",41,"Mexicano",true);
        Persona persona2 = new Persona("Alejandro","Castilo",17,"Colombiano",false);

        persona1.Presentar();
        System.out.println(persona1.MayorEdad + " "+ persona2.MayorEdad);
    }

    /*
        Clase Libro
        ISBN, Nombre de la obra, el autor, año de la edición, editorial 

        informacion():
            Text box

            String mensaje = String.format("""""",)
    
    */
}