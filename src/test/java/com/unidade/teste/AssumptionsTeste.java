package com.unidade.teste;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;


public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioVinicius(){
        assumeTrue("Root".equals(System.getenv("USER")));
        assertEquals(18,5+5);


    }
}
