package builder.caracteristica;

public class Tamano {

    public String tamano;

    public Tamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTamano() {
        return switch (tamano) {
            case "Pequeño" -> tamano;
            case "Mediana" -> tamano;
            case "Grande" -> tamano;
            default -> "No existe ese tamaño";
        };
    }

    public Double precioTamano() {
        double precio = 0.0;
        if ("Pequeño".equals(tamano)) {
            precio = 3.50;
        } else if ("Mediana".equals(tamano)) {
            precio = 6.50;
        } else if ("Grande".equals(tamano)) {
            precio = 9.50;
        }
        return precio;
    }

}
