package org.example.cozinheiro;

public class CozinheiroEspecializado extends Cozinheiro {

    public CozinheiroEspecializado(Cozinheiro proximo) {
        listaPedidos.add("especial");
        setProximoCozinheiro(proximo);
    }

    public String getDescricaoCargo() {
        return "Cozinheiro Especializado";
    }
}
