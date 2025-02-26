package mx.itson.edu.conversionmoneda.config;

import mx.itson.edu.conversionmoneda.controller.Convertir;
import mx.itson.edu.conversionmoneda.ui.Entrada;
import mx.itson.edu.conversionmoneda.ui.Salida;
import mx.itson.edu.conversionmoneda.user.Cliente;

public class Opciones {

    public void operarMonedaDinero() {
        System.out.println("Que moneda desea mx.itson.edu.conversionmoneda.controller.Convertir\n[1] Dollar\n[2] Euro\n[3] Rublo Ruso");
        int opcion = 1;
        System.out.println(opcion);
        elegirMoneda(opcion);
    }

    private void elegirMoneda( int opcion) {
        switch (opcion) {
            case 1:
                //dollar
                ingresarDineroMoneda(Moneda.DO);
                break;
            case 2:
                //euro
                ingresarDineroMoneda(Moneda.EU);
                break;
            case 3:
                //rublo
                ingresarDineroMoneda(Moneda.RU);
                break;
        }

    }

    private void ingresarDineroMoneda(Moneda moneda) {
        System.out.println("Usted eligio: "+moneda+" con el valor de: "+moneda.getvalor());
        System.out.println("Ingrese su dinero");
        double dinero = 130.0;
        System.out.println("####################################");
        System.out.println(dinero);
        Entrada entrada = new Entrada(moneda, new Cliente(dinero));
        Convertir convertir = new Convertir(entrada);
        Salida salida = new Salida(convertir, moneda);
        salida.mostrarResumen();
    }
}
