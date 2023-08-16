package builder.caracteristica;

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

    public Double precioMasa() {
        double precio = 0.0;
        if ("Integral".equals(masa)) {
            precio = 2.60;
        } else if ("Delgada".equals(masa)) {
            precio = 3.10;
        } else if ("Gruesa".equals(masa)) {
            precio = 5.90;
        }
        return precio;
    }

}
