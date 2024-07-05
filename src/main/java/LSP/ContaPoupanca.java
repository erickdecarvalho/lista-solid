package LSP;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(String titular, double saldo, int rendimento) {
        super(titular, saldo);
        this.rendimento = rendimento;
    }

    public void calcularRendimentoFinal() {
        this.setSaldo(this.getSaldo() + this.getSaldo() * (rendimento / 100));
    }
}
