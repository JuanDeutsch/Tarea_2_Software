package ingrediente;

public class Aceitunas implements Iingrediente {

    String nombre ="Aceitunas";

    Double precio = 0.30;

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public Double precioIngr() {
        return precio;
    }

    public Aceitunas() {

    }


}
