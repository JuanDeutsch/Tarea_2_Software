public abstract class CrearOrden {
    String Producto;
    int Inventario;

    public void verificarInventario(int inventario, String producto) {

    }

    public void facturar(int precioProducto, int precioEnvio) {

    }

    public void notificarCliente(String notificación) {
        System.out.println("Tu producto " + this.Producto + " ha sido envíado");
    }

    public abstract boolean envioPrioritario(boolean isFood);

    public abstract boolean embalajeSeguro(boolean isTech);
}
