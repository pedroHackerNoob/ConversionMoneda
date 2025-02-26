import mx.itson.edu.conversionmoneda.config.Moneda;
import mx.itson.edu.conversionmoneda.controller.Convertir;

public class Salida {
    //mostrar cantidad
    Convertir convertir;
    Moneda moneda;
    public Salida(Convertir convertir, Moneda moneda) {
        this.convertir = convertir;
        this.moneda = moneda;
    }

    public void mostrarResumen(){
        System.out.println("####################################");
        System.out.println(
                "Usted Compro: "+convertir.getCantidad()+" Billetes de:"+moneda+"\n"+
                        "Costo total de: "+convertir.getTotal()+" mxn\n"
                        +"Su cambio es: "+convertir.getCambio());
        System.out.println("####################################");
    }
}
