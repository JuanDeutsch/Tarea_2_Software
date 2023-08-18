package procesamiento;

import cliente.Cliente;

public class Facturar {
    int idFactura;
    Cliente cliente;
    double valorTotal;

    public Facturar(int idFactura, Cliente cliente, double valorTotal) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public void impresionFactura() {
        System.out.println("Hola " + cliente + " ,tu factura número " + idFactura + " tiene un costo de "+valorTotal);
    }
}
