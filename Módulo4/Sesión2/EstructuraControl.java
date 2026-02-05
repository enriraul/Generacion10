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
       /*
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
        }*/
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

        /* 
            For : Ciclo iterativos donde se conoce el número de ciclos
            Sintaxis:
            for(PuntoDePartida; CondiciónDeParo; Incremento)
            for(int i=0; i<10; i++){
                instrucciones
            }
       
        */

        //Código del diagrama de flujo CicloFor.png
        /*
        int n;
        n=10;
        for (int i=1;i<=n;i++) {
            System.out.println(i);
        }*/
        /*
        factorial
        Suman N números
        Recorrer Arreglos/listas/ArrayList
        
        factorial(n) = 1*2*3*4*..*x
        */
        /*int n = 10;
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = i*factorial;
            System.out.println(
                String.format("""
                Iteracion: %d
                Valor de Factorial actual: %d
                ________________________________
                """,i, factorial )
            );
        }
        System.out.println(factorial);
        */

        /*
        Ciclo While: ciclo determinado por una condición de paro

        Sintáxis:
        while(condición(es)){
            Intrucciones
        }
        */
        /*
        int numeroMagico=10,numeroUsuario;

        while (numeroMagico!=numeroUsuario) { 
            if(numeroMagico>numeroUsuario){
                System.out.println("El número mágico es mayor al número que propocionaste");
            }
            else{
                System.out.println("El número mágico es menor al número que propocionaste");
            }
            //Preguntarle una vez más por un nuevo número mágico
        }
        */
        /*
            Ciclo do-While: Las instrucciones se realizan al menos una vez, y esto
            lo determina una condición de ciclo
            Sintáxis:
            do{
                instrucciones
            }while(condición);
        */
        /*
        int n;
        do { 
            System.out.println("Ingresa un número: ");
            //Ingresa el usuario el número
        } while (!(n>0));
        */
    }       
}