public class Productos{

    private String CódigoBarra;
    private String nombreProducto;
    private Double precioProducto;
    private Double descuentoProducto = 1.0;

    public Productos(String CódigoBarra,String nombreProducto,Double precioProducto){
        this.CódigoBarra = CódigoBarra;
        this.nombreProducto = nombreProducto;  
        this.precioProducto = precioProducto;
    }

    public String getCódigoBarra(){
        return this.CódigoBarra;
    }
    public String getNombreProducto(){
        return this.nombreProducto;
    }
    public Double getPrecioProducto(){
        return this.precioProducto;
    }
    public void setDecuento(Double descuentoProducto){
        this.descuentoProducto = descuentoProducto;
    }

}