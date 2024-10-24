package org.example.pedido;

public class PedidoVegetariano implements TipoPedido {
    private static PedidoVegetariano instance = new PedidoVegetariano();

    private PedidoVegetariano() {}

    public static PedidoVegetariano getInstance() {
        return instance;
    }

    @Override
    public String getTipo() {
        return "vegetariano";
    }
}
