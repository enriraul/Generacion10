import java.util.ArrayList;

/*
    ArrayList es un tipo no primitivo, este tipo de dato
    es una lista con dimensión dinámica la cual puede agregar o eliminar
    elementos sin la restricción del espacio de memoria.

*/
public class Listas{
    //Sintaxis: ArrayList <TipoDato> objeto = new ArrayList<>();
    /* 
        métodos más utilizados:

            add agregar elemento
            remove quitar elemento
            set(index, item) colocar elemento en un indice especifico
    */
    public ArrayList<String> listaAlumnos;

    public Listas(){
        listaAlumnos = new ArrayList<>();
    }

    public void AgregarAlumno(String nombreAlumno,int index){
        listaAlumnos.add(nombreAlumno);
        listaAlumnos.add(index, nombreAlumno);
        //Actualizar elemento listaAlumnos.set(index, nombreAlumno);
    }
    public void EliminarAlumno(String nombreAlumno,int index){
        listaAlumnos.remove(nombreAlumno);
        listaAlumnos.remove(index);
    }

    public String getAlumno(int index){
        return listaAlumnos.get(index);
    }
    public void MostrarLista(){
        for (String nombre : listaAlumnos) {
            
        }
        for (int i = 0; i < listaAlumnos.size(); i++) {
            
        }
    }
}