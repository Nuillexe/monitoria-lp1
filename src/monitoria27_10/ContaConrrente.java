package monitoria27_10;

import java.util.Arrays;

public class ContaConrrente extends ContaBancaria {
    private String[] extrato;
    public ContaConrrente(String cod, String nomeTitular, Double saldo) {
        super(cod, nomeTitular, saldo);
        extrato=new String[10];

    }

    @Override
    public String toString() {
        return "Nome do Titular:" + nomeTitular+"\n"+
                "Codigo da conta:" + getCod()+"\n"+
                 "extrato=" + Arrays.toString(extrato);
    }



}
