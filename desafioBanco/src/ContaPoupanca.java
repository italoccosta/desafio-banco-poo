public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular) {
        super(titular);
    }

    public void exibirExtrato() {
        System.out.println("=== EXTRATO POUPANÇA ===");
        super.extrato();
    }

}
