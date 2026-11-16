package monitoria15_11.Questa5_listaPolimorfismo_herança_Abstrara_Interface;


public class Livro extends Produto {

    private String autor;
    private int paginas;

    public Livro(int codigo, String nome, double preco, int estoque,
                 String autor, int paginas) {

        super(codigo, nome, preco, estoque);

        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public boolean ehGrande() {
        return paginas > 200;
    }
}
