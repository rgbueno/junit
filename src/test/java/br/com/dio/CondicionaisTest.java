package br.com.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTest {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches="Rodrigo")
    public void validarAlgoSomenteNoUsuarioRodrigo(){
        Assertions.assertEquals(10, 5+5);
    }
}
