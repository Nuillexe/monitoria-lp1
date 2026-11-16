package monitoria27_10;

public abstract class ContaBancaria implements Conta{
    protected String nomeTitular;
    private String cod;
    protected double saldo;

    public ContaBancaria(String cod, String nomeTitular, Double saldo) {
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void depositar(double valor){
        this.saldo+=valor;
    }

    public double sacar(double valor){
        this.saldo-=valor;
        return valor;
    }
}
