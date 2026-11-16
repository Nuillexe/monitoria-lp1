package monitoria05_11;

import monitoria05_11.livraria.Livro;
import monitoria05_11.livraria.Produto;

public class AppLivraria {
    public static void main(String[] args) {
        Livro livro = new Livro(2, "Java como Programar", 200.0, 5, "Deitel", 1000);
        System.out.println(livro.getNome() + " de " + livro.getAuthor());
        System.out.println("É caro? " + livro.ehCaro());
        System.out.println("É grande? " + livro.ehGrande());
        System.out.println(livro);
    }
}
