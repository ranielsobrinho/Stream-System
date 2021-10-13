package streamsistema.classesEntidades;

public class pagamento {
    private double valor_pag;
    private String data_pag;
    private int forma_pag;

    //construtor
    public pagamento() {

    }

    //getters
    public double getValor_pag() {
        return valor_pag;
    }

    public String getData_pag() {
        return data_pag;
    }

    public int getForma_pag() {
        return forma_pag;
    }
}