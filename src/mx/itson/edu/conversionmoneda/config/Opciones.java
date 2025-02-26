package mx.itson.edu.conversionmoneda.config;

import mx.itson.edu.conversionmoneda.controller.Convertir;
import mx.itson.edu.conversionmoneda.ui.Entrada;
import mx.itson.edu.conversionmoneda.ui.Salida;
import mx.itson.edu.conversionmoneda.user.Cliente;

import java.util.Scanner;

public class Opciones {
    Scanner sc = new Scanner(System.in);
    public void operarMonedaDinero() {
        System.out.println("Que moneda desea Convertir");
        mostrarMonedas();
//        elegirMoneda(sc.nextInt());
        //automatizar
        elegirMoneda(3);
    }
    private void mostrarMonedas() {
        Moneda[] monedas = Moneda.values();
        int i = 0;
        for (Moneda c : monedas) {
            System.out.println("["+i+"] "+c+" Valor:"+monedas[i].getvalor());
            i++;
        }
    }
    private void elegirMoneda( int opcion) {
        ingresarDineroMoneda(Moneda.values()[opcion]);
    }

    private void ingresarDineroMoneda(Moneda moneda) {
        System.out.println("Usted eligio: "+moneda+" con el valor de: "+moneda.getvalor());
        System.out.println("Ingrese su dinero");
        double dinero = 130;
        System.out.println("####################################");
        System.out.println(dinero);
        Entrada entrada = new Entrada(moneda, new Cliente(dinero));
        Convertir convertir = new Convertir(entrada);
        Salida salida = new Salida(convertir, moneda);
        salida.mostrarResumen();
    }
}
