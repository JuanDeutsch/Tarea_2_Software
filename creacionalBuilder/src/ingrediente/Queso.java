package ingrediente;

public class Queso implements Iingrediente {

    String nombre ="Queso";

    Double precio = 0.30;

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public Double precioIngr() {
        return precio;
    }

    public Queso() {

    }
}
