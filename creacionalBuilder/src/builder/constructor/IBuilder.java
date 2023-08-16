package builder.constructor;

import builder.caracteristica.Masa;
import builder.caracteristica.Tamano;
import ingrediente.Iingrediente;

import java.util.HashMap;

public interface IBuilder {
    void crearTamano(Tamano tamano);
    void crearMasa(Masa masa);
    void crearIngredientes(HashMap<Iingrediente, Integer> map);
    void bordeQueso (boolean quesoExtra);

}
