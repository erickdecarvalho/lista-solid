package DIP;

public class PayPal implements TipoPagamento {
    @Override
    public double pagar(double valor) {
        double taxa = 0;
        double valorFinal = valor + taxa;
        System.out.println("O pagamento foi feito no PayPal!\nValor: " + valor + " R$\nTaxa: " + taxa + " R$\nValor Final: " + valorFinal);
        return valorFinal;
    }
}
