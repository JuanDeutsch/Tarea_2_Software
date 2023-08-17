public class Electronic extends CrearOrden {
    @Override
    public void verificarInventario(int inventario, String producto) {

    }

    @Override
    public void facturar(int precioProducto, int precioEnvio) {

    }

    @Override
    public void notificarCliente(String notificación) {

    }

    @Override
    public boolean envioPrioritario(boolean isFood) {
        return false;
    }

    @Override
    public boolean embalajeSeguro(boolean isTech) {
        if (this.Producto == "Tecnologia") {
            isTech = true;
        } else {
            isTech = false;
        }
        return isTech;
    }
}
