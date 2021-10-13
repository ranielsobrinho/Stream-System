package streamsistema.classesEntidades;

import java.util.Objects;

public class Pagamento {
    private final Integer id;
    private Double valorPag;
    private String dataPag;
    private Integer formaPag;
    private Integer qtdMensalidadesPagas;

    //construtor
    public Pagamento(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Pagamento other = (Pagamento) obj;
        return Objects.equals(this.id, other.id);
    }

    //getters

    public Integer getId() {
        return id;
    }

    public Integer getQtdMensalidadesPagas() {
        return qtdMensalidadesPagas;
    }

    public void setQtdMensalidadesPagas(Integer qtdMensalidadesPagas) {
        this.qtdMensalidadesPagas = qtdMensalidadesPagas;
    }
    
    
    public Double getValorPag() {
        return valorPag;
    }

    public String getDataPag() {
        return dataPag;
    }

    public Integer getFormaPag() {
        return formaPag;
    }

    public void setValorPag(Double valorPag) {
        this.valorPag = valorPag;
    }

    public void setDataPag(String dataPag) {
        this.dataPag = dataPag;
    }

    public void setFormaPag(Integer formaPag) {
        this.formaPag = formaPag;
    }
    
}