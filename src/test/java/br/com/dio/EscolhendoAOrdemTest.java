package br.com.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTest {

    @DisplayName("A")
    @Test
    public void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    public void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    public void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    public void validaFluxoD(){ 
        Assertions.assertTrue(true);
    }
}
