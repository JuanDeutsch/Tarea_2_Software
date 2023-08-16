package ingrediente;

public class Pina implements Iingrediente {

    String nombre ="Piña";

    Double precio = 0.30;

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public Double precioIngr() {
        return precio;
    }

    public Pina() {

    }
}
