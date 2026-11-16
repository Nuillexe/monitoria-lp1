package monitoria15_11.resolucaoQuestoes.questao7;

public class Portao implements Ligavel{
    private boolean aberto;

    public Portao() {
        aberto=false;
    }

    @Override
    public void ligar() {
        this.aberto=true;
        System.out.println("Portão abrindo");
    }

    @Override
    public void desligar() {
        this.aberto=false;
        System.out.println("Portão fechando");
    }

    @Override
    public boolean estaLigado() {
        return aberto;
    }
}
