package LSP;

public class ContaCorrente extends Conta{
    private double taxaManutencao;

    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    public void pagarTaxaDeManutencao() {
        this.setSaldo(this.getSaldo() + this.getSaldo() * (taxaManutencao / 100));
    }
}
