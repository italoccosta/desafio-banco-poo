import java.util.List;

public class Banco {

    private String nome_banco;
    private int codigo_banco;
    private List<Conta> contas;

    public Banco(String nome_banco, int codigo_banco) {
        this.nome_banco = nome_banco;
        this.codigo_banco = codigo_banco;
    }

    public String getNome_banco() {
        return nome_banco;
    }

    public int getCodigo_banco() {
        return codigo_banco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void exibirClientes() {
        System.out.println(contas);
    }

}
