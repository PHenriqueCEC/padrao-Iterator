package gym;

import java.util.Iterator;

public class Controle {

    public static Integer AlunosComArtesMarciais(Academia academia) {
        int quantidade = 0;
        for (Aluno aluno : academia) {
            if (aluno.getLuta()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer TotalDeAlunos(Academia academia) {
        int quantidade = 0;
        for (Iterator a = academia.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
