package mx.itson.edu.conversionmoneda.controller;

import mx.itson.edu.conversionmoneda.service.Aritmetica;
import mx.itson.edu.conversionmoneda.ui.Entrada;

public class Convertir {
    Entrada entrada;
    private double cantidad;
    private double total;
    private double cambio;

    public Convertir(Entrada entrada) {
        this.entrada = entrada;
        convertirDinero();
    }
    public void convertirDinero() {
        double precio = entrada.moneda().getvalor();
        cantidad = Aritmetica.DIVIDIR.calcular((int) entrada.cliente().getDinero(), precio);
        if (cantidad == 0) {
            System.out.println("No se puede convertir el dinero"+ cantidad);
        }
        total = Aritmetica.MULTIPLICAR.calcular(cantidad, precio);
        cambio = Aritmetica.RESTAR.calcular(entrada.cliente().getDinero(), total);
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    public double getCambio() {
        return cambio;
    }
}
