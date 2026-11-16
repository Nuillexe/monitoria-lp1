package monitoria15_11.resolucaoQuestoes.questao8;

public class SensorPresenca extends Sensor{
    double distanciaMedida;
    public SensorPresenca(String id) {
        super(id);
    }

    @Override
    public double lerValor() {
        return distanciaMedida;
    }
}
