package electronicos;

import procesamiento.TemplateOrden;

public class Electronic extends TemplateOrden {
    @Override
    public void verificarInventario(int inventario, String producto) {
        // Verificación de inventario de productos
    }

    @Override
    public void facturar() {
        //Facturacion de pedido
    }

    @Override
    public void notificarCliente(String notificación) {
        //Notificacion a cliente
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
