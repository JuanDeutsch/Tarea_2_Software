package ingrediente;

public class Pepperoni implements Iingrediente {

    String nombre ="Pepperoni";

    Double precio = 0.30;

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public Double precioIngr() {
        return precio;
    }

    public Pepperoni() {

    }
}
