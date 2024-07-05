package OCP;

public class PedidoClienteBasico extends Pedido {

    public PedidoClienteBasico(double valorTotal) {
        super(valorTotal);
        this.setClienteCategoria("Básico");
    }

    @Override
    public double aplicarDesconto() {
        return super.getValorTotal() * 0.05;
    }
}
