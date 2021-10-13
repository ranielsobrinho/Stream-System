package streamsistema.classesEntidades;

import java.util.Date;
import java.util.Objects;
/**
 *
 * @author Anizio
 */
public class Mensalidade {
   private String codigo;
   private Integer Status;
   private Date dataVencimento;
   private Double valor;
   private Double multa;
   private Double juros;
   private Integer idPagamento;
   private Usuario usuario;

    //Construtores
   public  Mensalidade(String codi){

    }

    public Mensalidade(Date dataVencimento, Double valor, Double multa, Double juros) {
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.multa = multa;
        this.juros = juros;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.codigo);
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
        final Mensalidade other = (Mensalidade) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Mensalidade{" + "dataVencimento=" + dataVencimento + ", valor=" + valor + ", multa=" + multa + ", juros=" + juros + '}';
    }   

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }    
    
    public Integer getIdPagamento() {
        return idPagamento;
    }

    //Getters
    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public Integer getStatus() {
        return Status;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public Double getMulta() {
        return multa;
    }

    public Double getJuros() {
        return juros;
    }
    //Seters

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public void setData_vencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }
}
