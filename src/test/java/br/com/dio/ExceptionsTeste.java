package br.com.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
    @Test
    public void validaCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("54321", 100);

        Assertions.assertThrows(IllegalArgumentException.class, () -> 
        new TransferenciaEntreContas().transfere(contaOrigem, contaDestino, -1));

        Assertions.assertDoesNotThrow(() -> new TransferenciaEntreContas().transfere(contaOrigem, contaDestino, 10));
    }
}
