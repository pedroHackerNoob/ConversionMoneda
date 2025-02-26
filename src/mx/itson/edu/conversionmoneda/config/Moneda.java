package mx.itson.edu.conversionmoneda.config;

public enum Moneda {
    DO(20.44),
    EU(21.36),
    RU(66.15);

    private final double valor;

    Moneda(double valor) {
        this.valor = valor;

    }
    public double getvalor() {
        return valor;
    }
}
