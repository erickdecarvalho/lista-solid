package DIP;

public class Main {
    public static void main(String[] args) {
        TipoPagamento cartaoCredito = new CartaoCredito();
        TipoPagamento paypal = new PayPal();

        ProcessadorPagamento processor1 = new ProcessadorPagamento(cartaoCredito);
        ProcessadorPagamento processor2 = new ProcessadorPagamento(paypal);

        processor1.efetuarPagamento(100.0);
        processor2.efetuarPagamento(50.0);
    }
}
