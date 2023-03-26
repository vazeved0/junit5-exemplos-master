package com.unidade.teste;

import com.github.vazeved0.junit.Pessoa;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;

public class AssetionsTeste {

    @Test
    void validarLancamentos(){
        int[]primeiroLancamento = {10,20,30,40,50};
        int[]segundoLancamento = {10,20,30,40,50};

        assertArrayEquals(primeiroLancamento,segundoLancamento);

        assertNotEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Zé", LocalDate.now());
        assertNotNull(pessoa);

    }

    @Test
    void validarNumerosTipoDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor,outroValor);
    }
}
