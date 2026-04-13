public class CuentaBancaria {

    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("--------------------------");
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Se depositó: $" + monto);
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Se retiró: $" + monto);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
}