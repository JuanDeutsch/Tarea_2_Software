package builder.constructor;

import builder.caracteristica.Masa;
import builder.caracteristica.PrecioTotal;
import builder.caracteristica.Tamano;
import ingrediente.Iingrediente;

import java.util.HashMap;

public class PrecioBuilder implements IBuilder{

    Double tamanoPrecio;
    Double precioExtra;
    Double masaPrecio;
    private HashMap<Iingrediente, Integer> precioIngrediente;

    @Override
    public void crearTamano(Tamano tamano) {
        this.tamanoPrecio = tamano.precioTamano();
    }

    @Override
    public void crearMasa(Masa masa) {
        this.masaPrecio = masa.precioMasa();
    }

    @Override
    public void crearIngredientes(HashMap<Iingrediente, Integer> map) {
        this.precioIngrediente = map;
    }

    @Override
    public void bordeQueso(boolean quesoExtra) {
        if (quesoExtra){
            this.precioExtra = 2.10;
        }else{
            this.precioExtra = 0.0;
        }
    }

    public PrecioTotal nuevoPrecio(){
        return new PrecioTotal(tamanoPrecio, masaPrecio, precioIngrediente, precioExtra);
    }

}
