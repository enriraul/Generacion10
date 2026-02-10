public  class Main{
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pedro","Perez","Calle de Pedro","Pedr0");
        Banco banco1 = new Banco("P001",persona1,1500.0f,500.0f);

        // System.out.println(banco1.Cliente.getNombre());
        // banco1.Cliente.setNombre("Pepe");
        // System.out.println(banco1.Cliente.getNombre());
        
        /* 
            Encapsulamiento:
                public (Sin restricción): El acceso a estos elementos está 
                permitido a todos los que tengan acceso a la clase. 

                private: Son aquellos elementos, que unicamente se tendrán acceso
                cuando se encuentran dentro de la misma clase
        
        */
        System.out.println(banco1.getCapital());
        banco1.RetiroCapital(500.0f);
        System.out.println(banco1.getCapital());
    }
}