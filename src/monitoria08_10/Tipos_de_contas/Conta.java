package monitoria08_10.Tipos_de_contas;

public abstract class Conta {
    protected String nomeTitular;
    private String cod;
    private double saldo;

    public Conta(String cod, String nomeTitular, Double saldo) {
        this.cod = cod;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor){
        this.saldo+=valor;
    }

    public double sacar(double valor){
        this.saldo-=valor;
        return valor;
    }



}
