package monitoria15_11.resolucaoQuestoes.questao7;

public class ArCondicionado implements Ligavel, Regulavel{


    private boolean ligado;
    int temperatura;

    public ArCondicionado() {
        temperatura=0;
    }

    @Override
    public void ligar() {
        ligado= true;
        System.out.println("ArCondicionado ligado");
        if(temperatura==0)
            temperatura=1;


    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Arcondicioado desligado");
    }

    @Override
    public boolean estaLigado() {//getLigada
        return ligado;
    }

    @Override
    public void aumentar() {
        if (temperatura < 3) {
            temperatura++;
        }
    }

    public void diminuir(){
        if(!(temperatura<=0)){
            temperatura--;
        }
    }

    public int getNivel(){
        return temperatura;
    }
}
