package DIP;

public class ProcessadorPagamento {
    private TipoPagamento tipoPagamento;

    public ProcessadorPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void efetuarPagamento(double amount) {
        tipoPagamento.pagar(amount);
    }
}
