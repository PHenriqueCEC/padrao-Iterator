package gym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ControleTest {
    @Test
    void deveContarAlunosComArtesMarciais() {
        Academia academia = new Academia(
                new Aluno("Gustavo", true),
                new Aluno("Armando", true),
                new Aluno("Gabriel", false),
                new Aluno("Pedro", true)
        );
        assertEquals(3, Controle.AlunosComArtesMarciais(academia));
    }

    @Test
    void deveContarTotalAlunos() {
        Academia academia = new Academia(
                new Aluno("Gustavo", true),
                new Aluno("Armando", true),
                new Aluno("Gabriel", false),
                new Aluno("Pedro", true)
        );
        assertEquals(4, Controle.TotalDeAlunos(academia));
    }
}
