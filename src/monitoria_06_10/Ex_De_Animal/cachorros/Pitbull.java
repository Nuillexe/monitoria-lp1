package monitoria_06_10.Ex_De_Animal.cachorros;

import java.security.SecureRandom;

public class Pitbull extends Cachorro {
    int força;
    int peso;

    public void setForça(int força) {
        this.força = força;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getForça() {
        return força;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public void latir(){
        System.out.println("Eu sou o brabo");
    }


    public void latir(String latido){
        System.out.println(latido);
    }
}
