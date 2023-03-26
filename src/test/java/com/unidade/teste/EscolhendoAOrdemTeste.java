package com.unidade.teste;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {
    @DisplayName("TesteA")
    @Order(4)
    @Test
    void validaFluxoA(){
        assertTrue(true);

    }
    @DisplayName("TesteB")
    @Order(3)
    @Test
    void validaFluxoB(){
        assertTrue(true);

    }
    @DisplayName("TesteC")
    @Order(2)
    @Test
    void validaFluxoC(){
        assertTrue(true);

    }
    @DisplayName("TesteD")
    @Order(1)
    @Test
    void validaFluxoD(){
        assertTrue(true);

    }
}
