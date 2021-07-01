package test.br.com.exercicios.java.exercicio3;

import br.com.exercicios.java.exercicio3.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppExercicioTresTests {

    Calculadora calculadora, calculadoraAssert;

    @BeforeEach
    public void setup() {
        calculadora = new Calculadora();
        calculadoraAssert = new Calculadora(calculadora.multiplicarPares(), calculadora.somarImpares());
    }

    @Test
    public void testarSomaImpares() {
        int somaImpares = calculadora.somarImpares();
        Assertions.assertEquals(somaImpares, calculadoraAssert.getSomaImpares());
    }

    @Test
    public void testarMultiplicacaoPares() {
        long multiplicacaoPares = calculadora.multiplicarPares();
        Assertions.assertEquals(multiplicacaoPares, calculadoraAssert.getMultiplicacaoPares());
    }
}
