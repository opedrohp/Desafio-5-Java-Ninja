public class BancoKonoha {
    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        origem.saldo -= valor;
        destino.depositar(valor);
    }

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor, String descricao) {

        origem.saldo -= valor;
        destino.depositar(valor);

        System.out.println("Transferência realizada: " + descricao);

    }
}
