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
        double precio = entrada.getMoneda().getvalor();
        cantidad = Aritmetica.DIVIDIR.calcular((int) entrada.getCliente().getDinero(), precio);
        total = Aritmetica.MULTIPLICAR.calcular(cantidad, precio);
        cambio = Aritmetica.RESTAR.calcular(entrada.getCliente().getDinero(), total);
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
