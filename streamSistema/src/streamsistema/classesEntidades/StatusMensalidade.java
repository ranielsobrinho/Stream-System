package streamsistema.classesEntidades;
/**
 *
 * @author Anizio
 */
public class StatusMensalidade {
   private static final int PAGA = 1;
   private static final int EM_ATRASO = 2;
   private static final int A_VENCER = 3;
    //Construtores
   public StatusMensalidade() {
      
   }

    public static int getPAGA() {
        return PAGA;
    }

    public static int getEM_ATRASO() {
        return EM_ATRASO;
    }

    public static int getA_VENCER() {
        return A_VENCER;
    }

    public static String getPAGA_Extenso(){
        return "Paga";
    }

    public static String getEM_ATRASO_Extenso(){
        return "Em atraso";
    }
    
    public static String getA_VENCER_Extenso(){
        return "A vencer";
    }

}
