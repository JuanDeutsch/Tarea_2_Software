package ingrediente;

public class Jamon implements Iingrediente {

    String nombre ="Jamon";

    Double precio = 0.30;

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public Double precioIngr() {
        return precio;
    }

    public Jamon() {

    }
}
