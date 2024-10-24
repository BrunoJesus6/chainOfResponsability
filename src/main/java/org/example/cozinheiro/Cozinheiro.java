package org.example.cozinheiro;

import org.example.pedido.Pedido;

import java.util.ArrayList;

public abstract class Cozinheiro {
    protected ArrayList<String> listaPedidos = new ArrayList<>();
    private Cozinheiro proximoCozinheiro;

    public Cozinheiro getProximoCozinheiro() {
        return proximoCozinheiro;
    }

    public void setProximoCozinheiro(Cozinheiro proximoCozinheiro) {
        this.proximoCozinheiro = proximoCozinheiro;
    }

    public abstract String getDescricaoCargo();

    public String prepararPedido(Pedido pedido) {
        if (listaPedidos.contains(pedido.getTipo())) {
            return getDescricaoCargo() + " preparou o pedido de " + pedido.getTipo();
        } else {
            if (proximoCozinheiro != null) {
                return proximoCozinheiro.prepararPedido(pedido);
            } else {
                return "Nenhum cozinheiro disponível para preparar o pedido de " + pedido.getTipo();
            }
        }
    }
}