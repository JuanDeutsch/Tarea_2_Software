public class paypal {

    private String banco;
    private int totalAPagar;
    private int disponible;

    public paypal(String banco, int totalAPagar, int disponible) {
        this.banco = banco;
        this.totalAPagar = totalAPagar;
        this.disponible = disponible;
    }

    public paypal() {
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

