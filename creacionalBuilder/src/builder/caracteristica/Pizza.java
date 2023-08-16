package builder.caracteristica;

import ingrediente.Iingrediente;

import java.util.HashMap;
import java.util.Map;

public class Pizza {

    private String tamano;
    private String masa;
    private HashMap<Iingrediente, Integer> ingrediente;
    private boolean extra;

    public Pizza(String tamano, String masa, HashMap<Iingrediente, Integer> ingrediente, boolean extra) {
        this.tamano = tamano;
        this.masa = masa;
        this.ingrediente = ingrediente;
        this.extra = extra;
    }

    public String formatoIngrediente(){
        String unir = "";
        for (Map.Entry<Iingrediente, Integer> map : ingrediente.entrySet()){
            unir += "Ingrediente = " + map.getKey() + '\n' + "Cantidad = " + map.getValue() + "\n";
        }
        return unir;
    }

    @Override
    public String toString() {
        return "Pizza" + '\n' +
                "Tamaño = " + tamano + '\n' +
                "Masa = " + masa + '\n' +
                 formatoIngrediente() +
                "Extra = " + extra + '\n';
    }
}
