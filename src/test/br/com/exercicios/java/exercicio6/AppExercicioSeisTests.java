package test.br.com.exercicios.java.exercicio6;

import br.com.exercicios.java.exercicio6.Agenda;
import br.com.exercicios.java.exercicio6.Contato;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppExercicioSeisTests {

    private Agenda agenda;
    private Contato contato, contatoAssert;

    @BeforeEach
    public void setup() {
        agenda = new Agenda();
        contato = new Contato("Giovanni", "giovanni@fakemail.com");
        contatoAssert = agenda.adicionarContato(contato);
    }

    @Test
    public void testarInclusaoContato() { Assertions.assertEquals(contato, contatoAssert); }

    @Test
    public void testarConsultaContatoSucesso() {
        String nome = "Giovanni";
        Contato contatoConsultado = agenda.consultarContato(nome);
        Assertions.assertEquals(contatoAssert, contatoConsultado);
    }

    @Test
    public void testarConsultaContatoErro() {
        String nome = "Ana Caroline";
        Contato contatoConsultado = agenda.consultarContato(nome);
        Assertions.assertEquals(null, contatoConsultado);
    }

    @Test
    public void testarExclusaoContatoSucesso() {
        String nome = "Giovanni";
        boolean excluido = agenda.removerContato(nome);
        Assertions.assertEquals(true, excluido);
    }

    @Test
    public void testarExclusaoContatoFalha() {
        String nome = "Ana Caroline";
        boolean excluido = agenda.removerContato(nome);
        Assertions.assertEquals(false, excluido);
    }
}
