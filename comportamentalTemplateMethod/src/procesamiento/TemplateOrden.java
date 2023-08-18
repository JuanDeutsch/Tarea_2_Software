package procesamiento;

public abstract class TemplateOrden {
    protected String Producto;
    int Inventario;

    public final void nuevoPedido(String producto) {
        Producto = producto;
        verificarInventario();
        facturar();
        notificarCliente();
    }

    public abstract void verificarInventario();

    public abstract void facturar();

    public abstract void notificarCliente();

    public boolean envioPrioritario(boolean isFood){
        return isFood;
    }

    public boolean embalajeSeguro(boolean isTech){
        return isTech;
    }
}
