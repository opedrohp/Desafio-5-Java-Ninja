public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
        tipoConta = TipoConta.POUPANCA;
    }

    @Override
    public void depositar(double valor) {
       saldo += valor - (valor * 0.01);
    }


}
