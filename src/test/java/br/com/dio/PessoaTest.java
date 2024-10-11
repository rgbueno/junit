package br.com.dio;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PessoaTest {

    @Test
    public void deveCalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("Augusto", LocalDate.of(2016, 03, 01));
        Assertions.assertEquals(8, pessoa.getIdade());
    }

    @Test
    public void deveRetornarSeEMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Rodrigo", LocalDate.of(1984, 03, 21));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Nickolas", LocalDate.of(2010, 01, 13));
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }
}
