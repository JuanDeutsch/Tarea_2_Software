package main;

import comida.Food;
import electronicos.Electronic;
import ropa.Clothes;
import cliente.*;
import procesamiento.Facturar;
import procesamiento.CrearOrden;

public class Main {
    public static void main(String[] args) {

        Cliente test = new Cliente("Pablito");

        Electronic electronic = new Electronic();

        CrearOrden nuevaOrden = new CrearOrden();
        nuevaOrden.CrearOrden(electronic);

        Facturar nuevaFactura = new Facturar(1234,test,80.30);
        nuevaFactura.impresionFactura();

        Notificacion enviarNotificacion = new Notificacion();
        enviarNotificacion.Notificacion();



    }
}