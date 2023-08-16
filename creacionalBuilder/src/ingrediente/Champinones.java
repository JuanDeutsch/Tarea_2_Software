package ingrediente;

public class Champinones implements Iingrediente {

    String nombre ="Champiñones";

    Double precio = 0.30;

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public Double precioIngr() {
        return precio;
    }

    public Champinones() {

    }
}
