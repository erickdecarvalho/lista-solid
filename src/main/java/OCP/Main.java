package OCP;

public class Main {
    public static void main(String[] args) {
        Pedido pedidoClienteBasico = new PedidoClienteBasico(100.0);
        Pedido pedidoClientePremium = new PedidoClientePremium(200.0);
        Pedido pedidoClienteMaster = new PedidoClienteMaster(300.0);

        System.out.println("Pedido básico - Desconto: " + pedidoClienteBasico.aplicarDesconto());
        System.out.println("Pedido premium - Desconto: " + pedidoClientePremium.aplicarDesconto());
        System.out.println("Pedido master - Desconto: " + pedidoClienteMaster.aplicarDesconto());
    }
}
