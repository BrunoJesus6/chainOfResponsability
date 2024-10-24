package org.example.pedido;

public class Pedido implements TipoPedido {
    private String tipo;

    public Pedido(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
