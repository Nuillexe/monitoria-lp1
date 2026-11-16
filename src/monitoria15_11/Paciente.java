package monitoria15_11;

public abstract class Paciente {
    protected  String nome;
    protected int idade;
    protected  String condicao_de_saude;

    public Paciente(String nome, int idade, String condicao_de_saude) {
        this.nome = nome;
        this.idade = idade;
        this.condicao_de_saude = condicao_de_saude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCondicao_de_saude() {
        return condicao_de_saude;
    }

    public void setCondicao_de_saude(String condicao_de_saude) {
        this.condicao_de_saude = condicao_de_saude;
    }


    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", condicao_de_saude='" + condicao_de_saude + '\'' +
                '}';
    }
}
