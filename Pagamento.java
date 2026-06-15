package ESTUDOSJAVA.Projects;

public class Pagamento {
    private double valor;
    private String formaDePagamento;
    private String dataPagamento;
    private boolean pago;

    public Pagamento(double valor, String formaDePagamento,String dataPagamento,boolean pago){
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
        this.dataPagamento = dataPagamento;
        this.pago = pago;
    }
    public Pagamento( double valor, String formaDePagamento){
        this. valor = valor;
        this.formaDePagamento = formaDePagamento;
        this.pago = false;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public Double getValor() {
        return valor;
    }

    public boolean Pago() {
        return pago;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public void confirmarPagamento() {
        pago = true;
        System.out.println("Pagamento confirmado!");

    }
    public String toString(){
        return "Valor: "+ valor + ","+
                "Forma de pagamento: "+ formaDePagamento+ ","+
                "Data de pagamento: "+ dataPagamento + ","+
                "Pago: "+ pago;
    }
}
