package monitoria_06_10.Ex_De_Animal;

import monitoria_06_10.Ex_De_Animal.cachorros.Cachorro;
import monitoria_06_10.Ex_De_Animal.cachorros.Pincher;
import monitoria_06_10.Ex_De_Animal.cachorros.Pitbull;

import java.util.Scanner;

public class testes {

    public static void main(String[] args) {
        Cachorro pitbull= new Pitbull();
        Animal pitbull2 = new Pitbull();
        Cachorro c= new Pincher();
        Scanner sc= new Scanner(System.in);

        String stop="n";
        Double numero;
        do {


            System.out.println("deseja parar?digite n pra continuar");
            stop=sc.nextLine();

        }while(stop.equalsIgnoreCase("n"));
    }
}
/*
* c= cadastro
* r=leitura
* u=updade
* d=delet
* */