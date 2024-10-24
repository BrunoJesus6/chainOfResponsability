package org.example.cozinheiro;

public class CozinheiroCarnes extends Cozinheiro {

    public CozinheiroCarnes(Cozinheiro proximo) {
        listaPedidos.add("carne");
        setProximoCozinheiro(proximo);
    }

    public String getDescricaoCargo() {
        return "Cozinheiro de Carnes";
    }
}
