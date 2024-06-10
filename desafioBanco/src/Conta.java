public abstract class Conta {

    private final int AGENCIA = 10;
    private static int NUM_CONTA = 0;

    protected int agencia;
    protected int numero_conta;
    protected double saldo;
    protected Cliente titular;

    public Conta(Cliente titular) {
        this.agencia = AGENCIA;
        this.numero_conta = ++NUM_CONTA;
        this.saldo = 0;
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta destinatario) {
        this.sacar(valor);
        destinatario.depositar(valor);
    }

    public void extrato() {
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numero_conta);
        System.out.println("Titular: " + titular.getNome());
        System.out.println("CPF: " + titular.getCpf());
        System.out.println(String.format("Saldo atual: R$ " + this.saldo));
    }

}
