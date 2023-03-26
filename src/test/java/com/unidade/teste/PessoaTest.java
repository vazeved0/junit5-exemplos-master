package com.unidade.teste;

import com.github.vazeved0.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade(){

        Pessoa azevedo = new Pessoa("Azevedo",LocalDate.of(2003,1,1));
        Assertions.assertEquals(20,azevedo.getIdade());

        Pessoa pessoa =  new Pessoa("Vinicius", LocalDate.of(2022,1,1));
        Assertions.assertEquals(1,pessoa.getIdade());
    }

    @Test
    void validarMaiorIdade(){
        Pessoa azevedo = new Pessoa("Azevedo",LocalDate.of(2003,1,1));
        Assertions.assertTrue(azevedo.ehMaiorDeIdade());

        Pessoa vinicius =  new Pessoa("Vinicius", LocalDate.of(2022,1,1));
        Assertions.assertFalse(vinicius.ehMaiorDeIdade());
    }

}
