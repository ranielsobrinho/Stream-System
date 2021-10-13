package streamsistema.classesEntidades;

/**
 *
 * @author Raniel
 */

public class TipoGenero{
    private String descricao;

    //Construtores
    public TipoGenero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}