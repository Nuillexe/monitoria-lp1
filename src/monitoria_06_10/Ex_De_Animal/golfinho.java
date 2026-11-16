package monitoria_06_10.Ex_De_Animal;

public class golfinho implements Animal{
    private boolean alimentado;
    private int deslocamento;
    private boolean descanso;

    public void andar(int deslocamento){
        this.deslocamento+=deslocamento;
    }
    public void dormir(){
        descanso=true;
    }

    public void comer(){
        alimentado=true;
    }
}
