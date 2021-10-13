package streamsistema.classesEntidades;

/**
 *
 * @author Raniel
 */

public class TipoGenero{
    private static final int ACAO_AVENTURA = 1;
    private static final int COMEDIA = 2;
    private static final int DRAMA = 3;
    private static final int TERROR = 4;

    //Construtores
    public TipoGenero() {
    }

    public static int getACAO_AVENTURA() {
        return ACAO_AVENTURA;
    }

    public static int getCOMEDIA() {
        return COMEDIA;
    }

    public static int getDRAMA() {
        return DRAMA;
    }

    public static int getTERROR() {
        return TERROR;
    }

}