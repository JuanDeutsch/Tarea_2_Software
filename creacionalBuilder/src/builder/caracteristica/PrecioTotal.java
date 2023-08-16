package builder.caracteristica;

import ingrediente.Iingrediente;

import java.util.HashMap;
import java.util.Map;

public class PrecioTotal {

    private Double tamano;
    private Double masa;
    private HashMap<Iingrediente, Integer> ingrediente;
    private Double extra;

    public PrecioTotal(Double tamano, Double masa, HashMap<Iingrediente, Integer> ingrediente, Double extra) {
        this.tamano = tamano;
        this.masa = masa;
        this.ingrediente = ingrediente;
        this.extra = extra;
    }

    public String formatoIngredientePrecio(){
        String unir = "";
        Double precio = 0.0;
        for (Map.Entry<Iingrediente, Integer> map : ingrediente.entrySet()){
            precio = map.getKey().precioIngr() * map.getValue();
            unir += '\n' +"Ingrediente = " + map.getKey() + '\n' + "Cantidad = " + map.getValue() + "\n" + "Precio = " + precio;
        }
        return unir;
    }

    public Double precioIngredientes(){
        Double sumCant = 0.0;
        for (Map.Entry<Iingrediente, Integer> map : ingrediente.entrySet()){
            Double precio = 0.0;
            precio = map.getKey().precioIngr() * map.getValue();
            sumCant += precio;
        }

        return sumCant;
    }

    public Double total(){
        Double total = 0.0;
        return total = tamano + masa + extra + precioIngredientes();
    }

    @Override
    public String toString() {
        return "Precio" + '\n' +
                "Precio del tamaño = " + tamano + '\n' +
                "Precio de la masa = " + masa + '\n' +
                formatoIngredientePrecio() + '\n' +
                "Precio del borde extra = " + extra + '\n' +
                "Total a pagar = " + total() + " Pesos";
    }
}
