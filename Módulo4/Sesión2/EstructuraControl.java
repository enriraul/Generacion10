public class EstructuraControl{
    public static void main(String[] args) {

        /* 
        ******************************************************
                        Condicionales
        ******************************************************
        */
        // float numero;
        // numero=100;
        /*
            if(condicional){
                instrucciones/indicaciones
            }
            else if(Condicional2){
            
            }
            else{  "En otro caso/cualquier otro caso/ o si no..."
            
            }

        */
        // System.out.println(numero<100);
        // if (numero <100){
        //     System.out.println("El número es menor que 100");
        // }
        // else{
        //     System.out.println("El número es mayor que 100");
        // }

        /* 
            Si se gasta menos de 100dls 
            no hay descuento

            Si se gasta menor o igual 250 dls 
            pero más de 100 dls
            hay descuento de 15%

            Si se gasta más de 250
            hay descuento 25%
        */

        /*

             =======Ejemplo dos======   
        
        */
       
        // float compra=251;
        // boolean tarjeta= true;
        // and &&  
        //or || 
        //negación  !
        /*
        if(compra<100 ){
            System.out.println("No obtiene descuento");
        }
        else if (compra<=250) {
            System.out.println("Obtiene un descuento del 15%");
        }
        else{
            System.out.println("Obtiene descuento del 25%");
        }*/
        /*
            Se ingresa dos valores y quiero determinar si son igual, 
            y si no lo son determinar cuál es numero mayor
            La actividad finaliza: 9:53
        */

        /*
            switch(variable){
                case valor:
                    break
                case valor2:
                    break
                default:

            
            }
        */
        int valor;

        valor = 3;

        switch (valor) {
            case 1:
                System.out.println("Se seleccionó la primera opción");
                break;
            case 2:
                System.out.println("Se seleccionó la segunda opción");
                break;
            case 3:
                System.out.println("Se seleccionó la tercera opción");
                break;
            default: //coc
                System.out.println("Opción no válida");
        }
        /*
            switch(case)
            caso 1: suman
            caso 2: restan
            caso 3: multiplican
            caso 4: división 

        */

       /* 
        ******************************************************
                            Ciclos
        ******************************************************
        */
    }       
}