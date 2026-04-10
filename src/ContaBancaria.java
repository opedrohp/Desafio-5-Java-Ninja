public abstract class ContaBancaria implements Conta {
    protected double saldo;
    protected TipoConta tipoConta;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("Saldo: %.2f%n", saldo);
    }

    public abstract void depositar(double valor);
}
