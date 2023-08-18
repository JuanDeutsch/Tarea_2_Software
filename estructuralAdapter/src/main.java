import javax.swing.*;

public class main {

    public main() {
    }

    public static void main(String[] args) {
        int valueMethod = Integer.parseInt(JOptionPane.showInputDialog("Seleccione metodo de pago"));
        switch (valueMethod) {
            case 1:
                new paypal();
                System.out.println("Pago con Paypal exitoso");
                break;
            case 2:
                new tarjetasCredito();
                System.out.println("Pago con tarjeta exitoso");
                break;
            case 3:
                new AdaptadorPagosPlus(new pagosPlus());
                System.out.println("Pago con PagosPlus exitoso");
        }

    }
}
