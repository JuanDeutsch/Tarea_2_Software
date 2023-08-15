package buider.caracteristica;

public class Masa {

    public String masa;

    public Masa(String masa) {
        this.masa = masa;
    }

    public String getMasa() {
        return switch (masa) {
            case "Integral" -> masa;
            case "Delgada" -> masa;
            case "Gruesa" -> masa;
            default -> "No existe esa masa";
        };
    }

    public static void main(String[] args) {
        Masa masa = new Masa("Integral");
        System.out.println(masa.getMasa());
    }

}
