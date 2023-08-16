package main;

import builder.caracteristica.Masa;
import builder.caracteristica.Pizza;
import builder.caracteristica.PrecioTotal;
import builder.caracteristica.Tamano;
import builder.constructor.PizzaBuilder;
import builder.constructor.PrecioBuilder;
import ingrediente.*;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        Tamano tamano = new Tamano("Mediana");
        Masa masa = new Masa("Integral");
        boolean quesoExtra = true;
        Pina pina = new Pina();
        Jamon jamon = new Jamon();
        Champinones champinones = new Champinones();
        Queso queso = new Queso();

        HashMap <Iingrediente, Integer> ingredientesPizza = new HashMap<>();

        ingredientesPizza.put(pina,6);
        ingredientesPizza.put(jamon,9);
        ingredientesPizza.put(champinones,2);
        ingredientesPizza.put(queso,5);

        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.crearTamano(tamano);
        pizzaBuilder.crearMasa(masa);
        pizzaBuilder.bordeQueso(quesoExtra);
        pizzaBuilder.crearIngredientes(ingredientesPizza);

        Pizza pizza = pizzaBuilder.nuevaPizza();
        System.out.println(pizza.toString());

        PrecioBuilder precioBuilder = new PrecioBuilder();
        precioBuilder.crearTamano(tamano);
        precioBuilder.crearMasa(masa);
        precioBuilder.bordeQueso(quesoExtra);
        precioBuilder.crearIngredientes(ingredientesPizza);

        PrecioTotal precioTotal = precioBuilder.nuevoPrecio();
        System.out.println(precioTotal.toString());
    }
}


