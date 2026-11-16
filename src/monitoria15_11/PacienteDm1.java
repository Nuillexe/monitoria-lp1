package monitoria15_11;

public class PacienteDm1 extends Paciente implements InsulinoDependente{
    private int relacaoInsulinaEGlicemia=40; //uma unidade abaixa 50pontos

    public PacienteDm1(String nome, int idade, String condicao_de_saude){
        super(nome, idade, "dm1");
    }

    public void somarIdade(int n){
        this.setIdade(this.idade +n);
    }

    @Override
    public void aplicarInsulina() {

    }

    @Override
    public void contarCarboidrato(){

    }

    @Override
    public void calcularRelaçãoInsulinaGlicemia() {

    }

    @Override
    public String toString() {
        return "PacienteDm1{" +
                "relacaoInsulinaEGlicemia=" + relacaoInsulinaEGlicemia +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", condicao_de_saude='" + condicao_de_saude + '\'' +
                '}';
    }
}
