package streamsistema.classesEntidades;

import java.util.Objects;

/**
 *
 * @author Raniel
 */

public class Midia {
    private final Integer id;
    private String titulo;
    private Integer ano;
    private String autor;
    private Integer Genero;
    private Integer TipoMidia;

    //Construtores
    public Midia(Integer id){
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Midia other = (Midia) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Midia{" + "titulo=" + titulo + ", ano=" + ano + ", autor=" + autor + '}';
    }

    // Getters

    public Integer getId(){
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
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

    public void setAno(Integer ano){
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