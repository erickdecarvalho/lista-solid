package OCP;

public class PedidoClientePremium extends Pedido {
    public PedidoClientePremium(double valorTotal) {
        super(valorTotal);
        this.setClienteCategoria("Premium");
    }

    @Override
    public double aplicarDesconto() {
        return super.getValorTotal() * 0.10;
    }
}
