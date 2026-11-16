package monitoria01;
/*
Escreva um trecho que prove que dois objetos podem ter os mesmos valores nos
atributos e, ainda assim, serem objetos diferentes. Utilize == e compare os campos
titulo e autor.
*/
class Autor {
    private String nome;
    private int idade;

    public Autor(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Titulo {
    private boolean emprestado;
    private String nome;
    private Autor autor;

    public Titulo(String nome, Autor autor) {
        this.nome = nome;
        this.autor = autor;
        this.emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }
}

public class LivroEAutor {

    public static void main(String[] args) {

        Autor autor = new Autor(20, "Fulano");

        // Criamos dois objetos Titulo diferentes,
        // mas com os mesmos valores nos atributos.
        Titulo l1 = new Titulo("Código Limpo", autor);
        Titulo l2 = new Titulo("Código Limpo", autor);

        /*
         * == compara as referências dos objetos.
         *
         * Apesar de l1 e l2 possuírem os mesmos valores,
         * são objetos diferentes, pois foram criados com
         * dois new diferentes.
         */
        if (l1 == l2) {
            IO.println("l1 e l2 são o mesmo objeto.");
        } else {
            IO.println("l1 e l2 são objetos diferentes.");
        }

        /*
         * Comparação do campo nome.
         *
         * Como nome é uma String, utilizamos equals()
         * para comparar o conteúdo das strings.
         */
        if (l1.getNome().equals(l2.getNome())) {
            IO.println("Os títulos possuem o mesmo nome.");
        } else {
            IO.println("Os títulos possuem nomes diferentes.");
        }

        /*
         * Comparação do campo autor.
         *
         * Neste caso, l1 e l2 receberam a mesma referência
         * para o objeto Autor.
         *
         * Portanto, == retorna true.
         */
        if (l1.getAutor() == l2.getAutor()) {
            IO.println("Os títulos possuem o mesmo objeto Autor.");
        } else {
            IO.println("Os títulos possuem objetos Autor diferentes.");
        }
    }
}