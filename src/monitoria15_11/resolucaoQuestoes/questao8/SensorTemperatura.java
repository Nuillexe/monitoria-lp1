package monitoria15_11.resolucaoQuestoes.questao8;

public class SensorTemperatura extends Sensor{
    private double temperaturaCelsius;
    public SensorTemperatura(String id){
        super(id);
    }

    @Override
    public double lerValor(){
        return temperaturaCelsius;
    }
}
