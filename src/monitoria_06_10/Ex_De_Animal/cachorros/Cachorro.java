package monitoria_06_10.Ex_De_Animal.cachorros;

import monitoria_06_10.Ex_De_Animal.Animal;



public abstract class Cachorro implements Animal {
    private boolean alimentado;
    private int deslocamento;
    private boolean descanso;
    private String nome;
    private String raça;

    Coleira coleira;
    public Cachorro(){
        alimentado=false;
        deslocamento=0;
        descanso=false;
        coleira= new Coleira();
        nome=null;
        raça=null;
    }

    public Cachorro(boolean alimentado, boolean descansar, int deslocamento, String nome) {
        this.alimentado = alimentado;
        this.descanso = descansar;
        this.deslocamento = deslocamento;
        this.nome=nome;
        coleira=new Coleira(nome);
        raça=null;
    }

    public boolean isAlimentado() {
        return alimentado;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }

    public boolean isDescanso() {
        return descanso;
    }

    public void descansar() {
        this.descanso = true;
    }

    public int getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(int deslocamento) {
        this.deslocamento = deslocamento;
    }


    public void andar(int deslocamento){
        this.deslocamento+=deslocamento;
    }
    public void dormir(){
        descanso=true;
    }

    public void comer(){
        alimentado=true;
    }

    public void latir(){
        System.out.println("Au au");
    }
}
