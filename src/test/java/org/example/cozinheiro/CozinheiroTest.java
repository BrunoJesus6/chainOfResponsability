package org.example.cozinheiro;

import org.example.pedido.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CozinheiroTest {

    Cozinheiro gerente;
    Cozinheiro especializado;
    Cozinheiro carnes;
    Cozinheiro vegetariano;

    @BeforeEach
    void setUp() {
        gerente = new GerentePizzaria();
        especializado = new CozinheiroEspecializado(gerente);
        carnes = new CozinheiroCarnes(especializado);
        vegetariano = new CozinheiroVegetariano(carnes);
    }

    @Test
    void deveRetornarCozinheiroVegetarianoParaPedidoVegetariano() {
        assertEquals("Cozinheiro Vegetariano preparou o pedido de vegetariano",
                vegetariano.prepararPedido(new Pedido("vegetariano")));
    }

    @Test
    void deveRetornarCozinheiroDeCarnesParaPedidoDeCarne() {
        assertEquals("Cozinheiro de Carnes preparou o pedido de carne",
                vegetariano.prepararPedido(new Pedido("carne")));
    }

    @Test
    void deveRetornarCozinheiroEspecializadoParaPedidoEspecial() {
        assertEquals("Cozinheiro Especializado preparou o pedido de especial",
                vegetariano.prepararPedido(new Pedido("especial")));
    }

    @Test
    void deveRetornarGerenteParaPedidoNaoReconhecido() {
        assertEquals("Gerente da Pizzaria aceitou o pedido de desconhecido",
                vegetariano.prepararPedido(new Pedido("desconhecido")));
    }
}
