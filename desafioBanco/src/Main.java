public class Main {
    public static void main(String[] args) {

        Cliente italo = new Cliente();
        italo.setNome("Italo");
        italo.setCpf("12345678");

        ContaCorrente corrente = new ContaCorrente(italo);
        ContaPoupanca poupanca = new ContaPoupanca(italo);

        corrente.depositar(150);
        poupanca.depositar(100);

        corrente.exibirExtrato();
        System.out.println();
        poupanca.exibirExtrato();
        System.out.println();

        corrente.transferir(25, poupanca);
        System.out.println("Extrato após a transferência");

        corrente.exibirExtrato();
        System.out.println();
        poupanca.exibirExtrato();
    }
}
