public class tarjetasCredito {

    private String banco;
    private int totalAPagar;
    private int disponible;

    public tarjetasCredito(String banco, int totalAPagar, int disponible) {
        this.banco = banco;
        this.totalAPagar = totalAPagar;
        this.disponible = disponible;
    }

    public tarjetasCredito() {
    }

    public String getBanco() {
        return this.banco;
    }

    public int getDisponible() {
        return this.disponible;
    }

    public int getTotalAPagar() {
        return this.totalAPagar;
    }
}


