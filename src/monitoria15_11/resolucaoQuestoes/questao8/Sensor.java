package monitoria15_11.resolucaoQuestoes.questao8;

public abstract class Sensor {
    protected String id;
    protected boolean ativo;

    public Sensor(String id) {
        this.id = id;
        this.ativo = true;
    }

    public String getId() { return id; }
    public boolean isAtivo() { return ativo; }
    public void desativar() { this.ativo = false; }

    // Método abstrato: cada sensor concreto deve dizer como lê o dado
    public abstract double lerValor();

    // Método concreto reutilizado por todas as subclasses
    public String obterStatus() {
        if (!ativo) {
            return "Sensor " + id + " está inativo";
        }
        return "Sensor " + id + " - Leitura atual: " + lerValor();
    }
}
