public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
        tipoConta = TipoConta.CORRENTE;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}
