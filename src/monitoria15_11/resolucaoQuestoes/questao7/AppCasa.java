package monitoria15_11.resolucaoQuestoes.questao7;


//4:Deu erro pq pra ser chamado na main ou por qualquer classe  metodo precisa ser public  e sem adicionar esse modificador de visisbilidade qualquer classe é priada
public class AppCasa {
    public static void main() {
    /*    Ligavel lampadaSala= new Lampada("sala");
        System.out.println("A lampada esta: "+ lampadaSala.estaLigado());

        lampadaSala.ligar();
        System.out.println("A lampada esta: "+ lampadaSala.estaLigado());
        Ligavel portao= new Portao();
        Ligavel ventilador= new Ventilador("sala");
        Ligavel lampadaSala= new Lampada("sala");

        portao.ligar();
        portao.desligar();
        portao.estaLigado();*/


        Ligavel[] dispositivos= new Ligavel[3];
        dispositivos[0]= new Lampada("sala");
        dispositivos[1] = new Ventilador("quarto");
        dispositivos[2] = new Portao();


        Regulavel[] dispositiosR= new Regulavel[3];
        dispositiosR[0]= new Ventilador("sala");
        dispositiosR[1]= new ArCondicionado();


        for (int i = 0; i < dispositivos.length; i++) {
            dispositivos[i].ligar();
        }

        desligarTudo(dispositivos);



    }

    private static void desligarTudo(Ligavel[] lista) {
        /*int tamanho= lista.length;

        for(int i=0; i<tamanho; i++){
            lista[i].desligar();
        }*/


        for(Ligavel l: lista){
            l.desligar();
        }
    }

    /*
    * rodada 1
    *
    *   l-> lista[0]
    *
    * rodada 2
     *
     *   l-> lista[1]
     *
     * rodada 3
     *
     *   l-> lista[2]
     *
     * rodada 4
     *
     *   l-> lista[3]
    * */
}
