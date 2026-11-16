package monitoria_06_10.Ex_De_Animal.cachorros;

public class Coleira {
    String nome;
    int numeroDoDono;

    public Coleira(String nome){
        this.nome=nome;

    }
    public Coleira(){
        this.nome=null;
        this.numeroDoDono=0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDoDono() {
        return numeroDoDono;
    }

    public void setNumeroDoDono(int numeroDoDono) {
        this.numeroDoDono = numeroDoDono;
    }
}
