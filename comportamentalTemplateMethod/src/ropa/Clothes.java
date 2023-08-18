package ropa;

import procesamiento.TemplateOrden;

public class Clothes extends TemplateOrden {
    @Override
    public void verificarInventario(int inventario, String producto) {

    }

    @Override
    public void facturar() {

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
        return false;
    }
}
