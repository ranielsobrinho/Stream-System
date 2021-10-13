package streamsistema.classesEntidades;

/**
 *
 * @author Raniel
 */

public class TipoMidia{
    private static final int DOCUMENTARIO = 1;
    private static final int FILME = 2;
    private static final int SERIE = 3;
    private static final int DESENHO = 4;
    //Construtores
    public TipoMidia() {
    }

    public static int getDOCUMENTARIO() {
        return DOCUMENTARIO;
    }

    public static int getFILME() {
        return FILME;
    }

    public static int getSERIE() {
        return SERIE;
    }

    public static int getDESENHO() {
        return DESENHO;
    }

}