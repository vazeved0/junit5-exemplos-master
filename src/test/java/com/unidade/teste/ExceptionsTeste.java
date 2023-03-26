package com.unidade.teste;

import com.github.vazeved0.junit.Conta;
import com.github.vazeved0.junit.TransferenciaEntreContas;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ExceptionsTeste {

    @Test
    void validaCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456",0);
        Conta contaDestino = new Conta("123458",100);

        TransferenciaEntreContas trasacao = new TransferenciaEntreContas();

        // espera que seja lançado a excessao
        assertThrows(IllegalArgumentException.class,() ->
                trasacao.transfere(contaOrigem,contaDestino,-1));

        // Não espera o lançamento de excecao
        assertDoesNotThrow(() ->
                trasacao.transfere(contaOrigem,contaDestino,1));

    }
}
