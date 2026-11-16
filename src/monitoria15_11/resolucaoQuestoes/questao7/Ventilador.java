package monitoria15_11.resolucaoQuestoes.questao7;

public class Ventilador implements Ligavel, Regulavel{
    private String nome;
    private boolean ligado;
    int velocidade;

    public Ventilador(String nome) {
        this.nome = nome;
        velocidade=0;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void ligar() {
        ligado= true;
        System.out.println("Lâmpada da " + nome + " ligada");
        if(velocidade==0)
            velocidade=1;


    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Lâmpada da " + nome + " desligada");
    }

    @Override
    public boolean estaLigado() {//getLigada
        return ligado;
    }
    // TODO: implementar ligar(), desligar() e estaLigado()
    // Cada mensagem deve mencionar o nome do ventilador.

    @Override
    public void aumentar() {
        if (velocidade < 3) {
            velocidade++;
        }
    }

    public void diminuir(){
        if(!(velocidade<=0)){
            velocidade--;
        }
    }

    public int getNivel(){
        return velocidade;
    }
}
