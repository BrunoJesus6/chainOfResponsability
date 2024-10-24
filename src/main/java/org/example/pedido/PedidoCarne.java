package org.example.pedido;

public class PedidoCarne implements TipoPedido {
    private static PedidoCarne instance = new PedidoCarne();

    private PedidoCarne() {}

    public static PedidoCarne getInstance() {
        return instance;
    }

    @Override
    public String getTipo() {
        return "carne";
    }
}
