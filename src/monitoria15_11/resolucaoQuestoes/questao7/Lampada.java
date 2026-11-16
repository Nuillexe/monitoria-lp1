package monitoria15_11.resolucaoQuestoes.questao7;

public class Lampada implements Ligavel {
    private String comodo;
    private boolean ligada;

    public Lampada(String comodo) {
        this.comodo = comodo;
    }

    @Override
    public void ligar() {
        ligada = true;
        System.out.println("Lâmpada da " + comodo + " ligada");
    }

    @Override
    public void desligar() {
        ligada = false;
        System.out.println("Lâmpada da " + comodo + " desligada");
    }

    @Override
    public boolean estaLigado() {//getLigada
        return ligada;
    }
}