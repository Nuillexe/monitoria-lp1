package monitoria15_11.Questa5_listaPolimorfismo_herança_Abstrara_Interface;


import java.util.Scanner;


public class AppLivrariaExercicio05 {

    static Scanner sc = new Scanner(System.in);

    // Item A
    public static int cadastrarProduto(Produto[] produtos, int posicao) {

        System.out.println("\n1 - Livro");
        System.out.println("2 - Papelaria");
        System.out.print("Escolha o tipo de produto: ");

        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Estoque: ");
        int estoque = sc.nextInt();
        sc.nextLine();

        if (tipo == 1) {

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Número de páginas: ");
            int paginas = sc.nextInt();

            produtos[posicao] = new Livro(
                    codigo, nome, preco, estoque, autor, paginas
            );

        } else if (tipo == 2) {

            System.out.print("Descrição: ");
            String descricao = sc.nextLine();

            System.out.print("Fabricante: ");
            String fabricante = sc.nextLine();

            produtos[posicao] = new Papelaria(
                    codigo, nome, preco, estoque,
                    descricao, fabricante
            );

        } else {
            System.out.println("Tipo inválido!");
            return posicao;
        }

        System.out.println("Produto cadastrado!");

        return posicao + 1;
    }

    // Item B
    public static void main(String[] args) {

        Produto[] produtos = new Produto[20];

        int quantidadeProdutos = 0;

        Pedido pedido = new Pedido(1, "15/11/2026");

        int opcao;

        do {

            System.out.println("\n===== LIVRARIA =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Adicionar produto ao pedido");
            System.out.println("3 - Finalizar pedido");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    if (quantidadeProdutos < produtos.length) {

                        quantidadeProdutos = cadastrarProduto(
                                produtos, quantidadeProdutos
                        );

                    } else {
                        System.out.println("Limite de produtos atingido!");
                    }

                    break;

                case 2:

                    if (quantidadeProdutos == 0) {
                        System.out.println("Cadastre produtos primeiro!");
                        break;
                    }

                    System.out.println("\nProdutos disponíveis:");

                    for (int i = 0; i < quantidadeProdutos; i++) {

                        System.out.println(
                                i + " - " + produtos[i].listar()
                        );
                    }

                    System.out.print("Escolha o índice do produto: ");
                    int indice = sc.nextInt();

                    if (indice < 0 || indice >= quantidadeProdutos) {
                        System.out.println("Produto inválido!");
                        break;
                    }

                    System.out.print("Quantidade desejada: ");
                    int quantidade = sc.nextInt();

                    if (quantidade <= 0) {
                        System.out.println("Quantidade inválida!");
                        break;
                    }

                    if (quantidade > produtos[indice].getEstoque()) {
                        System.out.println("Estoque insuficiente!");
                        break;
                    }

                    pedido.addItem(produtos[indice], quantidade);

                    System.out.println("Produto adicionado ao pedido!");

                    break;

                case 3:

                    System.out.println("\n===== RESUMO DO PEDIDO =====");

                    pedido.listarItens();

                    System.out.println(
                            "Total: R$ " + pedido.calcularTotal()
                    );

                    System.out.println("Pedido finalizado!");

                    break;

                default:

                    if (opcao != 3) {
                        System.out.println("Opção inválida!");
                    }
            }

        } while (opcao != 3);

        sc.close();
    }
}