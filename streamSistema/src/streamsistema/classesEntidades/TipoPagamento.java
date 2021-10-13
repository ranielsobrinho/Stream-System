package streamsistema.classesEntidades;

public class tipo{
    private static final int boleto=1;
    private static final int cartao_cred=2;
    private static final int cartao_deb=3;
    private static final int pix=4;
    private static final int ted=5;

    //construtor
    public tipo() {
    }

    //getters
    public static int getBoleto(){
        return boleto;
    }
    public static int getCartao_cred(){
        return cartao_cred;
    }
    public static int getCartao_deb(){
        return cartao_deb;
    }
    public static int getPix(){
        return pix;
    }
    public static int getTed(){
        return ted;
    }

}
