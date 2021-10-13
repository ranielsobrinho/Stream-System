package streamsistema.classesEntidades;

import java.util.Date;
/**
 *
 * @author Raniel
 */

public class Mídia {
    private String titulo;
    private Date ano;
    private String autor;
    private Integer Genero;
    private Integer TipoMidia;

    //Construtores
    
    public Midia(String titulo, Date ano, String autor){
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }

    // Getters

    public String getTitulo(){
        return titulo;
    }

    public Date getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getGenero() {
        return Genero;
    }

    public Integer getTipoMidia() {
        return TipoMidia;
    }

    // Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAno(Date ano){
        this.ano = ano;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setGenero(Integer Genero){
        this.Genero = Genero;
    }

    public void setTipoMidia(Integer TipoMidia){
        this.TipoMidia = TipoMidia;
    }
}