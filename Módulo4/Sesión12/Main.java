import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Productos> carrito = new ArrayList<>();

        Productos productos = new Productos("1111000011","NombreProducto",1.0);
        ProductosAlimenticios productosA = new ProductosAlimenticios("1111000012","NombreProducto",2.0, true,"CarnesRojas");

        carrito.add(productos);
        carrito.add(productosA);

        Productos producto_0 = carrito.get(0);
        System.out.println(producto_0.getCódigoBarra());


        ProductosAlimenticios producto_1 = (ProductosAlimenticios)carrito.get(1); //cast = cambio tipo de dato
        System.out.println(producto_1.getCódigoBarra());
        producto_1.ge
    }

}