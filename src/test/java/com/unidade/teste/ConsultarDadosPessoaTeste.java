package com.unidade.teste;

import com.github.vazeved0.junit.GerenciadorDeConexaoComBancoDeDados;
import com.github.vazeved0.junit.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class ConsultarDadosPessoaTeste {

    @BeforeAll
    static void AbreConexao(){
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
        System.out.println("Rodou abre Conexão");
    }

    @AfterEach
    void insereDadosParaTeste(){
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("Lucio", LocalDate.of(2003,01,01)));
    }

    @AfterEach
    void removerDadosDoTeste(){
        GerenciadorDeConexaoComBancoDeDados.removeDados( new Pessoa ("Lucio", LocalDate.of(2003,01,01)));
    }

    @Test
    void validarDadosRetorno(){
        assertTrue(true);
    }

    @AfterAll
    static void fechaConexao(){
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
        System.out.println("Rodou fecha Conexão");
    }
}
