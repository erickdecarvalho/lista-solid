package OCP;

public class PedidoClienteMaster extends Pedido {
    public PedidoClienteMaster(double valorTotal) {
        super(valorTotal);
        this.setClienteCategoria("Master");
    }

    @Override
    public double aplicarDesconto() {
        return super.getValorTotal() * 0.30;
    }
}
