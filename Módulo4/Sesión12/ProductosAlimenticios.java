public class ProductosAlimenticios extends Productos{

    private Boolean Refrigeración;
    private String categoria; //Carnes Rojas, Pescados, Pollo, Verduras, Frutas, etc
    
    public ProductosAlimenticios(String CódigoBarra,String nombreProducto,Double precioProducto, Boolean Refrigeración, String categoria ){
        super(CódigoBarra, nombreProducto,precioProducto);
        this.Refrigeración = Refrigeración;
        this.categoria = categoria;
    }
    
    public Boolean getRefrigeración(){
        return this.Refrigeración;
    }

    public String getCategoria(){
        return this.categoria;
    }
}