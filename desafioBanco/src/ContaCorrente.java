public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    public void exibirExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.extrato();
    }
}
