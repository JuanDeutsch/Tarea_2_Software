package comida;

import procesamiento.TemplateOrden;

public class Food extends TemplateOrden {
    int inventarioComida;
    @Override
    public void verificarInventario(int inventario, String producto) {
        this.inventarioComida = inventario;
    }

    @Override
    public void facturar() {

    }

    @Override
    public void notificarCliente(String notificación) {

    }

    @Override
    public boolean envioPrioritario(boolean isFood) {
        return true;
    }

}
