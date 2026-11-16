package monitoria15_11.Questa5_listaPolimorfismo_herança_Abstrara_Interface;


public class Pedido {

    private Item[] itens;
    private int quantidadeDeItens;
    private int codigo;
    private String data;

    public Pedido(int codigo, String data) {
        this.codigo = codigo;
        this.data = data;
        this.itens = new Item[10];
        this.quantidadeDeItens = 0;
    }

    public void addItem(Produto p, int qtd) {

        if (quantidadeDeItens < 10) {

            itens[quantidadeDeItens] = new Item(p, qtd);
            quantidadeDeItens++;

        } else {
            System.out.println("Pedido cheio! Máximo de 10 itens.");
        }
    }

    public String getData() {
        return data;
    }

    public int getCodigo() {
        return codigo;
    }

    public double calcularTotal() {

        double total = 0;

        for (int i = 0; i < quantidadeDeItens; i++) {
            total += itens[i].calcularValor();
        }

        return total;
    }

    // Método adicional para imprimir os itens
    public void listarItens() {

        for (int i = 0; i < quantidadeDeItens; i++) {

            Item item = itens[i];

            System.out.println(
                    item.getProduto().getNome()
                            + " | Quantidade: " + item.getQuantidade()
                            + " | Valor: R$ " + item.calcularValor()
            );
        }
    }
}