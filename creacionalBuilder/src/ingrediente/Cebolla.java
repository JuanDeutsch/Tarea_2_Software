package ingrediente;

public class Cebolla implements Iingrediente {

    String nombre = "Cebolla";

    Double precio = 0.30;

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public Double precioIngr() {
        return precio;
    }

    public Cebolla() {

    }
}
