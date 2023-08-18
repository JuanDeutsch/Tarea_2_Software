package ropa;

import procesamiento.TemplateOrden;

public class Clothes extends TemplateOrden {
    @Override
    public void verificarInventario() {

    }

    @Override
    public void facturar() {

    }

    @Override
    public void notificarCliente() {

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
