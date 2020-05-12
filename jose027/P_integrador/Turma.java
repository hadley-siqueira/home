import java.util.ArrayList;
public final class Turma {
    private String nome;
    private int ano;
    Curso curso;
    private String sala;
    ArrayList <Aluno> alunos = new ArrayList();

    public Turma(String nome, Curso c) {
        this.nome = nome;
        char palavra[] = nome.toCharArray();
        this.ano =  Character.getNumericValue(palavra[0]);
        this.curso = c;
        //this.sala = nome.substring(nome.length() - 1, nome.length() + 1, +1);
        c.inserirTurma(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inserirAluno(Aluno aluno, Curso curso) {
        if (aluno.curso.getCodigo().contains(curso.getCodigo())){
            alunos.add(aluno);
        }
    }
}


