import java.util.Scanner;
public final class Aluno extends Pessoa {
    private String nome, senha;
    Turma turma;
    Curso curso;
    private int matricula;

    public Aluno (String nome, String senha, Curso cur, Turma tur, int matricula) {
        this.nome = nome;
        this.senha = senha;
        this.curso = cur;
        this.turma = tur;
        this.curso = cur;
        this.matricula = matricula;
        tur.inserirAluno(this, cur);
    }

    public String[] tirarDuvida(String p, String materia, Professor prof, Materia mat) {
        Scanner s = new Scanner(System.in);
        if (p.equalsIgnoreCase(prof.getNome()) == true && materia.equalsIgnoreCase(mat.getNome()) == true && mat.professores.contains(prof) == true) {
            System.out.print("Digite sua dúvida: ");
            String duvida = s.next();
            String vetor[] = {this.nome, this.turma.getNome(), this.curso.getNome(), Integer.toString(this.matricula), duvida};
            return vetor;
        }
    }
}


