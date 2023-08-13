package pizza;

public class PequenoGruesa implements Grande{
    @Override
    public void definirMasa() {
        System.out.println("Agregando la masa gruesa");
    }
}
