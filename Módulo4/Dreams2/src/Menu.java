public class Menu{
    public MenuPanel menuframe;
    public DreamsDB db;
    public NavegarPanel nv;
    private String mensajeMenu = 
    """
        1.- Mostrar todos los productos
        2.- Seleccionar productos
        3.- Eliminar producto
        4.- Pagar
        5.- Salir
    """;
    private int TipoMensaje=0;

    public Menu(MenuPanel menuframe, DreamsDB db, NavegarPanel nv){
        this.menuframe = menuframe;
        this.db = db;
        this.nv = nv;
        this.menuframe.bloqueTexto.setText(mensajeMenu);
        this.menuframe.bloqueTexto.setEnabled(false);
        this.menuframe.aceptar.addActionListener(e->this.Action());
        this.menuframe.regresar.addActionListener(e->this.Regresar());
    }

    public void Action(){
        System.out.println(this.menuframe.opciones.getText());
        this.menuframe.aceptar.setVisible(false);
        this.menuframe.regresar.setVisible(true);
        this.menuframe.opciones.setVisible(false);
        if (TipoMensaje==0) {
            this.menuframe.bloqueTexto.setText(db.mostrarInventario());
        }

    }
    public void Regresar(){
        this.menuframe.bloqueTexto.setText(mensajeMenu);
        this.menuframe.aceptar.setVisible(true);
        this.menuframe.regresar.setVisible(false);
        this.menuframe.opciones.setVisible(true);
    }
}