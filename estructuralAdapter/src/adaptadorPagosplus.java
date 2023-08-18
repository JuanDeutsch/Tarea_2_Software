class AdaptadorPagosPlus implements metodosDePago {
    private pagosPlus pagosplus;
    private int disponible;
    private String banco;
    private int totalAPagar;

    public void PagosPlus(String banco, int totalAPagar, int disponibles) {
        this.banco = banco;
        this.totalAPagar = totalAPagar;
        this.disponible = disponibles;
    }

    public AdaptadorPagosPlus(pagosPlus pagosplus) {
        this.pagosplus = pagosplus;
    }

    public String getbanco() {
        return this.pagosplus.getbanco();
    }


    public int getDisponible() {
        return this.pagosplus.getDisponinble();
    }

    public int getTotalAPagar() {
        return this.pagosplus.getTotalAPagar();
    }
}

