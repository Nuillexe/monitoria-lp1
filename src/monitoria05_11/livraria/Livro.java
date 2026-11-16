package monitoria05_11.livraria;

import monitoria05_11.livraria.Produto;

public class Livro extends Produto{
    private String author;
    private int numeroPaginas;

    public Livro(int codigo, String nome, double preco, int estoque, String author, int numeroPaginas){
        super(codigo, nome, preco,  estoque);
        this.author=author;
        this.numeroPaginas=numeroPaginas;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean ehGrande(){
        return numeroPaginas>200;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "numeroPaginas=" + numeroPaginas +
                ", codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}
