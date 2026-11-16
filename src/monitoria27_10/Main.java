package monitoria27_10;
//Rhuan Rocha Rodrigues
public class Main {
    public static void main(String[] args) {
        Conta conta= new ContaConrrente("111","Emanuel", 200.0);
        ContaBancaria b= new ContaPopanca("1111","maria", 22200.0);

        /*
        * <Nome da interface> <nome do objeto>= new <Classe que implementa a interface>
        <Nome da Classe Abstrata> <nome do objeto>= new <Classe que implementa herda a classe abstrata>
        * */

        System.out.println(conta);



    }
}
