public abstract class crearOrden {
    public abstract void verificarInventario();
    public abstract void facturar();
    public abstract void notificarCliente();

    public boolean envioPrioritario(boolean isFood){
        boolean perecedero = isFood;
        return perecedero;
    }
    public boolean embalajeSeguro(boolean isTech){
        boolean embalaje = isTech;
        return embalaje;
    }
}
