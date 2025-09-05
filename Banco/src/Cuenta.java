public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        {
            saldo = saldo + cantidad;
        }
    }

        public void retirar(double cantidad) {
        {
            saldo = saldo - cantidad;
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
