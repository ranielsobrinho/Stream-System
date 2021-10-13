package streamsistema.classesEntidades;

public class TipoPagamento{
    private static final int BOLETO = 1;
    private static final int CARTAO_CREDITO = 2;
    private static final int CARTAO_DEBITO = 3;
    private static final int PIX = 4;
    private static final int TED = 5;

    //construtor
    public TipoPagamento() {
    }

    //getters

    public static int getBOLETO() {
        return BOLETO;
    }

    public static int getCARTAO_CREDITO() {
        return CARTAO_CREDITO;
    }

    public static int getCARTAO_DEBITO() {
        return CARTAO_DEBITO;
    }

    public static int getPIX() {
        return PIX;
    }

    public static int getTED() {
        return TED;
    }

}
