public class Main {
    public static void main(String[] args) {
        BancoKonoha banco = new BancoKonoha();

        ContaCorrente ContaNaruto = new ContaCorrente(100);
        ContaPoupanca PoupancaNaruto = new ContaPoupanca(50);

        ContaNaruto.depositar(50);
        PoupancaNaruto.depositar(50);

        ContaNaruto.consultarSaldo();
        PoupancaNaruto.consultarSaldo();

        banco.transferir(ContaNaruto,PoupancaNaruto, 30);
        banco.transferir(PoupancaNaruto, ContaNaruto, 10, "Devolução");

        ContaNaruto.consultarSaldo();
        PoupancaNaruto.consultarSaldo();

    }
}
