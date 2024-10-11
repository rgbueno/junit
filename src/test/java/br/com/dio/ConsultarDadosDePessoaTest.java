package br.com.dio;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTest {
    @BeforeAll
    public static void configuraConexao(){
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
    }

    @BeforeEach
    public void insereDadosParaTeste(){
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("Carolina", LocalDate.of(1986,06,03)));
    }

    @AfterEach
    public void removeDadosDoTeste(){
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("Carolina", LocalDate.of(1986,06,03)));
    }

    @Test
    public void validarDadosDeRetorno(){
        assertNull(null);
    }

    @AfterAll
    public static void finalizarConexao(){
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
    }

}
