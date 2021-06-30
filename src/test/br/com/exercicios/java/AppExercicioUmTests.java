package test.br.com.exercicios.java;

import br.com.exercicios.java.exercicio1.MaiorNumero;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AppExercicioUmTests {

    @Test
    public void testarMaiorNumero() {
        int resultadoMaiorNumero = MaiorNumero.imprimirMaiorNumero(10, 8);
        Assertions.assertEquals(10, resultadoMaiorNumero);
    }

    @Test
    public void testarNumerosIguais() {
        int resultadoMaiorNumero = MaiorNumero.imprimirMaiorNumero(10, 10);
        Assertions.assertEquals(0, resultadoMaiorNumero);
    }
}
