package test.br.com.exercicios.java.exercicio4;

import br.com.exercicios.java.exercicio4.ComparaNumero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppExercicioQuatroTest {

    @Test
    public void testarMaiorNumeroPrimeiro() {
        int primeiroNumero = 99;
        int segundoNumero = 80;

        Assertions.assertEquals(primeiroNumero, ComparaNumero.compararNumeros(primeiroNumero, segundoNumero));
    }

    @Test
    public void testarMaiorNumeroSegundo() {
        int primeiroNumero = 80;
        int segundoNumero = 99;

        Assertions.assertEquals(segundoNumero, ComparaNumero.compararNumeros(primeiroNumero, segundoNumero));
    }

    @Test
    public void testarNumerosIguais() {
        int primeiroNumero = 99;
        int segundoNumero = 99;

        Assertions.assertEquals(0, ComparaNumero.compararNumeros(primeiroNumero, segundoNumero));
    }
}
