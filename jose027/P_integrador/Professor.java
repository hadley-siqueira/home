import java.util.Scanner;
public final class Professor extends Pessoa {
    private String nome, senha;
    Materia materia;
    private int matricula;

    public Professor(String nome, String senha, int matricula, Materia mat) {
        this.nome = nome;
        this.senha = senha;
        this.materia = mat;
        this.matricula = matricula;
        mat.armazenarProfessor(this);
    }

    public String responderDuvida(Aluno aluno) {
        String duvida[] = aluno.tirarDuvida(this.nome, this.materia.getNome(), this, this.materia);
        String dados[] = {"Nome", "Turma", "Curso", "matricula", "Dúvida"};
        for (int c = 0; c < duvida.length; c++) {
            System.out.println(dados[c] + ":" + " " + duvida[c]);
        }
        Scanner s = new Scanner(System.in);
        String resposta = s.next();
        return resposta;
    }
}

