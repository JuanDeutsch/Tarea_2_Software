package ingrediente;

public class Queso implements Iingredientes {

    private boolean extra;

    @Override
    public void cantidad() {

    }

    @Override
    public void precio(double precio) {

    }

    public void siExtra(){
        extra = true;
    }

    public void noExtra(){
        extra = false;
    }
}
