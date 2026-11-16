package monitoria15_11.Questa5_listaPolimorfismo_herança_Abstrara_Interface;


public class Papelaria extends Produto {

    private String descricao;
    private String fabricante;

    public Papelaria(int codigo, String nome, double preco, int estoque,
                     String descricao, String fabricante) {

        super(codigo, nome, preco, estoque);

        this.descricao = descricao;
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String listarEtiqueta() {
        return nome + " " + fabricante + " R$: " + preco;
    }
}
