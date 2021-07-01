package test.br.com.exercicios.java.exercicio5;

import br.com.exercicios.java.exercicio5.MediaAluno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AppExercicioCincoTests {

    @Test
    public void testarNotaInvalidaPositiva() {
        Integer nota = 999;
        boolean notaValida = MediaAluno.validarNota(nota);
        Assertions.assertEquals(false, notaValida);
    }

    @Test
    public void testarNotaInvalidaNegativa() {
        Integer nota = -1;
        boolean notaValida = MediaAluno.validarNota(nota);
        Assertions.assertEquals(false, notaValida);
    }

    @Test
    public void testarNotaValida() {
        Integer nota = 100;
        boolean notaValida = MediaAluno.validarNota(nota);
        Assertions.assertEquals(true, notaValida);
    }

    @Test
    public void testarCalculoMedia() {
        MediaAluno mediaAluno = new MediaAluno();
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(100);
        notas.add(100);
        notas.add(100);
        notas.add(99);

        Integer media = mediaAluno.calcularMedia(notas);
        Assertions.assertEquals(99, media);
    }
}
