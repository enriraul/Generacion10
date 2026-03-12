import java.util.ArrayList;

public class Venta{

    private Cliente cliente;
    private ArrayList<Carrito> carrito;

    public Venta(Cliente cliente){
        this.cliente = cliente;
        carrito = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad){
        if (cantidad > 0) {
            if (producto.getStock()>=cantidad) {
                carrito.add(new Carrito(producto, cantidad));
            }
        }
        else{
            System.out.println("Solicitud inválida, la cantidad debe ser mayor que cero");
        }
    }

    public void mostrarCarrito(){
        int c = 1;
        for (Carrito elemento : carrito) {
            System.out.println("Producto no."+c);
            System.out.println(elemento.getProducto().info());
            System.out.println("Cantidad: "+elemento.getCantidad()+"\n");
            c++;
        }
    }

    public void eliminarProducto(int index,int cantidad){
        if (((index-1)<=carrito.size()) && (index>=0)) {
            if(carrito.get(index).getCantidad() >= cantidad){
                if ((carrito.get(index).getCantidad()-cantidad) == 0) {
                    carrito.remove(index);
                }
                else{
                    int dif = (carrito.get(index).getCantidad()-cantidad);
                    carrito.get(index).setCantidad(dif);
                }
            }
            else{
                System.out.println("No es posible realizar la operación");
            }
        }
        else{
            System.out.println("No es posible realizar la operación");
        }
    }

    public ArrayList<Carrito> getCarrito(){
        return this.carrito;
    }

    /* Método de proceder a pago*/
}