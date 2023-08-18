package comida;

import procesamiento.TemplateOrden;

public class Food extends TemplateOrden {
    int inventarioComida;
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
        return true;
    }

}
