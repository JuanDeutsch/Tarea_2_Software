package builder.constructor;

import builder.caracteristica.Masa;
import builder.caracteristica.Pizza;
import builder.caracteristica.Tamano;
import ingrediente.Iingrediente;

import java.util.HashMap;

public class PizzaBuilder implements IBuilder {

    private String tamanoPedido;
    private String masaPedido;
    private boolean extra;
    private HashMap<Iingrediente, Integer> ingrediente;

    @Override
    public void crearTamano(Tamano tamano) {
        this.tamanoPedido = tamano.getTamano();
    }

    @Override
    public void crearMasa(Masa masa) {
        this.masaPedido = masa.getMasa();
    }

    @Override
    public void crearIngredientes(HashMap<Iingrediente, Integer> map) {
        this.ingrediente = map;
    }

    @Override
    public void bordeQueso(boolean quesoExtra) {
        this.extra = extra;
    }

    public Pizza nuevaPizza() {
        return new Pizza(tamanoPedido, masaPedido, ingrediente, extra );
    }
}
