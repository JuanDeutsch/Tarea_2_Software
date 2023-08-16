package ingrediente;

public class Pimientos implements Iingrediente {

    String nombre ="Pimientos";

    Double precio = 0.30;

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public Double precioIngr() {
        return precio;
    }
    public Pimientos() {

    }
}
