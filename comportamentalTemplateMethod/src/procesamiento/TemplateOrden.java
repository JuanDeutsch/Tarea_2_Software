package procesamiento;

public abstract class TemplateOrden {
    protected String Producto;
    int Inventario;

    public final void nuevoPedido(String producto) {
        Producto = producto;
    }

    public abstract void verificarInventario(int inventario, String producto);

    public abstract void facturar();

    public abstract void notificarCliente(String notificación);

    public boolean envioPrioritario(boolean isFood){
        return isFood;
    }

    public boolean embalajeSeguro(boolean isTech){
        return isTech;
    }
}
