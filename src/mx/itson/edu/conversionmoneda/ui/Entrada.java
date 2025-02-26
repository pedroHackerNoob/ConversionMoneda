import mx.itson.edu.conversionmoneda.config.Moneda;

public class Entrada {
    private Moneda moneda;
    private Cliente cliente;

    public Entrada(Moneda moneda, Cliente cliente) {
        this.moneda = moneda;
        this.cliente = cliente;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
