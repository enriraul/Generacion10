import java.util.List;

public class Producto{
    private String Nombre;
    private Double Precio;
    private List<String> Categoria;
    private Integer Stock;


    public Producto(String Nombre,Double Precio,
    List<String> Categoria, Integer Stock)
    {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Categoria = Categoria;
        this.Stock = Stock;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }
    public void setPrecio(Double Precio)
    {
        this.Precio = Precio;
    }

    public void setStock(Integer Stock)
    {
        this.Stock = Stock;
    }

    public void setStock(List<String> Categoria)
    {
        this.Categoria = Categoria;
    }


    public String getNombre()
    {
        return this.Nombre;
    }
    public Double getPrecio()
    {
        return this.Precio;
    }

    public Integer getStock()
    {
        return this.Stock;
    }

    public List<String> getCategoria()
    {
        return this.Categoria;
    }

    public String info()
    {
        return String.format("""
                ___________________________
                Nombre: %s %s
                Precio: %s
                Stock: %s
                ___________________________
                """,this.Nombre, this.Precio, this.Stock);
    }

}