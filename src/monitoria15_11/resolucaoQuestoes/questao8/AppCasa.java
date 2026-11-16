package monitoria15_11.resolucaoQuestoes.questao8;

public class AppCasa {

    public static void main() {
        Sensor[] sensores= new Sensor[3];

        sensores[0]= new SensorPresenca("1");
        sensores[1]=new SensorTemperatura("2");

        sensores[2]=new SensorTemperatura("3");


        for(Sensor s: sensores){
            System.out.println(s.obterStatus());
        }

    }
}
