package OCP;

public class Pedido {
    private double valorTotal;
    private String clienteCategoria;

    public Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double aplicarDesconto() {
        return 0.0;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getClienteCategoria() {
        return clienteCategoria;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setClienteCategoria(String clienteCategoria) {
        this.clienteCategoria = clienteCategoria;
    }
}
