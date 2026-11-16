package monitoria29_09.Recursividade;

import java.util.Scanner;

/** O QUE É UM FATORIAL:
 * O fatorial de um número inteiro positivo n (representado por n!) é o produto
 * de todos os números inteiros positivos menores ou iguais a n.
 * Exemplo: 5! = 5 × 4 × 3 × 2 × 1 = 120.
 * Por definição, 0! = 1.
 */
public class Fatorial {
    // 1°: 5 * fatorial(4) // 2°: 4 * fatorial(3) // 3°: 3*fatorial(2) // 4°: 2*fatorial(1) // 5°: 1
    static long fatorial(int n){
        if(n < 0) {
            // Retorna 0 para indicar entrada inválida (não existe fatorial de número negativo).
            return 0;
        }
        if(n == 0 || n == 1){
            // Caso base: 0! e 1! são iguais a 1.
            return 1;
        }
        // Passo recursivo: n! = n × (n-1)!
        return n * fatorial(n - 1);
    }

    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consome o caractere de quebra de linha deixado pelo nextInt(Resolvendo Bug).

        if(n < 0){
            System.out.println("O número digitado é menor que zero, não existe fatorial.");
        } else {
            System.out.println("Fatorial de " + n + ": " + fatorial(n) + "\n");
        }

        System.out.println("Deseja continuar? Digite 's' para continuar ou qualquer outra tecla para sair.");
        String resposta = sc.nextLine();

        if(resposta.equalsIgnoreCase("s")){

            main(args);
        }

        System.out.println("Bye bye");
    }
}

/** COMO FICARIA ESSE CÓDIGO SE ELE NÃO UTILIZASSE RECURSIVIDADE
*public class Fatorial {
 *     // Versão iterativa- com uso da estrutura de repetição for
 *     static long fatorialIterativo(int n){
 *         if(n < 0) return 0; // inválido
 *         long resultado = 1;
 *         for(int i = 2; i <= n; i++){
 *             resultado = resultado * i;
 *         }
 *         return resultado;
 *     }
 *
 *     static public Scanner sc = new Scanner(System.in);
 *
 *     public static void main(String[] args) {
 *         String resposta="s";
 *         while(s=="s"){
 *          System.out.println("Digite um número: ");
 *          int n = sc.nextInt();
 *          sc.nextLine(); // consome quebra de linha
 *
 *           if(n < 0){
 *                 System.out.println("O número digitado é menor que zero, não existe fatorial.");
 *            } else {
 *                 System.out.println("Fatorial de " + n + ": " + fatorial(n) + "\n");
 *           }
 *
 *          System.out.println("\n Deseja continuar? Digite 's' para continuar qualquer outra coisa para sair.");
 *          String resposta = sc.nextLine();
 *     }
 *     System.out.println("Bye bye");
 * }
*
*
* */
