package LSP;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("João", 100.0, 1);
        System.out.println(cc.getSaldo());
        cc.depositar(20.0);
        cc.pagarTaxaDeManutencao();
        System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca("Maria", 200, 2);
        cp.depositar(1000.0);
        cp.calcularRendimentoFinal();
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
    }
}
