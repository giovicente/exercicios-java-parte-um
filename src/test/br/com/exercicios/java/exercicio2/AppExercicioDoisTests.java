package test.br.com.exercicios.java.exercicio2;

import br.com.exercicios.java.exercicio2.NumeroDecrescente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppExercicioDoisTests {

    @Test
    public void testarNumeroDecrescente() {
        int numero = 30;
        Assertions.assertEquals(-1, NumeroDecrescente.imprimirOrdemDecrescente(numero));
    }
}
