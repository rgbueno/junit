package br.com.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumpionsTest {

    @Test
    public void validarAlgoSomenteNoUsuarioRodrigo(){
        Assumptions.assumeTrue(true);
        Assertions.assertEquals(10, 5+5);
    }
}
