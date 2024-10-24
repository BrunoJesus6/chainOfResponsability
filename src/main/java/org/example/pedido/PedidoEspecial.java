package org.example.pedido;

public class PedidoEspecial implements TipoPedido {
    private static PedidoEspecial instance = new PedidoEspecial();

    private PedidoEspecial() {}

    public static PedidoEspecial getInstance() {
        return instance;
    }

    @Override
    public String getTipo() {
        return "especial";
    }
}
