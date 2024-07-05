package DIP;

public class CartaoCredito implements TipoPagamento {
    @Override
    public double pagar(double valor) {
        double taxa = valor * 0.01;
        double valorFinal = valor + taxa;
        System.out.println("O pagamento foi feito no cartão de credito!\nValor: " + valor + " R$\nTaxa: " + taxa + " R$\nValor Final: " + valorFinal);
        return valorFinal;
    }
}
