package gym;

public class Aluno {

    private String nome;
    private boolean lutaToo;

    public Aluno(String nome, boolean lutaToo) {
        this.nome = nome;
        this.lutaToo = lutaToo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getLuta() {
        return lutaToo;
    }

    public void setLuta(boolean lutaToo) {
        this.lutaToo = lutaToo;
    }
}
