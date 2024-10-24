package org.example.cozinheiro;

public class CozinheiroVegetariano extends Cozinheiro {

    public CozinheiroVegetariano(Cozinheiro proximo) {
        listaPedidos.add("vegetariano");
        setProximoCozinheiro(proximo);
    }

    public String getDescricaoCargo() {
        return "Cozinheiro Vegetariano";
    }
}
