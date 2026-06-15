package ESTUDOSJAVA.Projects;
import ESTUDOSJAVA.Projects.CategoriaVeiculo;
import java.util.Date;

public class Reserva {

    private Date dataInicio;
    private Date dataFim;
    private long totalDias;
    private Veiculo veiculo;
    private Cliente cliente;
    private Pagamento pagamento;
    private StatusReserva status;

    public Reserva(Date dataInicio,Date dataFim, long totalDias,Veiculo veiculo,Cliente cliente,Pagamento pagamento,StatusReserva status){
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.totalDias = totalDias;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.status = status;
    }
    public Double calcularTotal(){
        return totalDias * veiculo.getPrecoDiaria();
    }
    public void confirmar(){
        status = StatusReserva.CONFIRMADA;
    }
    public void cancelar(){
        status = StatusReserva.CANCELADA;
    }
    public String toString(){
        return "Cliente -> "+ cliente+ "\n"+
                "Veiculo -> "+ veiculo + "\n"+
                "Categoria -> "+veiculo.getCategoria()+"\n"+
                "Dias -> "+ totalDias + "\n"+
                "Total -> "+ calcularTotal() + "\n"+
                "Status -> "+status;
    }
    public Date getDataInicio(){
        return dataInicio;
    }
    public Date getDataFim(){
        return dataFim;
    }
    public long getTotalDias(){
        return totalDias;
    }
    public Veiculo getVeiculo(){
        return veiculo;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public Pagamento getPagamento(){
        return pagamento;
    }
    public StatusReserva getStatus(){
        return status;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    public void setTotalDias(long totalDias) {
        this.totalDias = totalDias;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
