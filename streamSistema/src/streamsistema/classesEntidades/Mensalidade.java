package streamsistema.classesEntidades;

import java.util.Date;
/**
 *
 * @author Anizio
 */
public class Mensalidade {
   private String codMensalidade;
   private Integer Status;
   private Date dataVencimento;
   private Double valor;
   private Double multa;
   private Double juros;


    //Construtores
   public  Mensalidade(){

    }

    public Mensalidade(Date dataVencimento, Double valor, Double multa, Double juros) {
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.multa = multa;
        this.juros = juros;
    }

    //Getters

    public String getCodMensalidade() {
        return codMensalidade;
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

    public void setCodMensalidade(String codMensalidade) {
        this.codMensalidade = codMensalidade;
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
