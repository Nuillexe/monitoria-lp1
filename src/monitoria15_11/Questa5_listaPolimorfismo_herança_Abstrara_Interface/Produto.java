package monitoria15_11.Questa5_listaPolimorfismo_herança_Abstrara_Interface;

public class Produto {

    protected int codigo;
    protected String nome;
    protected double preco;
    protected int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean ehCaro() {
        return preco > 100;
    }

    public String listar() {
        return codigo + " " + nome + " R$: " + preco;
    }
}
