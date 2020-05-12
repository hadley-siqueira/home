import java.util.ArrayList;
public final class Materia {
    private String nome;
    private int codigo;
    ArrayList <Professor> professores = new ArrayList();

    public Materia(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void armazenarProfessor(Professor professor) {
        if (professor.materia.nome.equalsIgnoreCase(this.nome)) {
            professores.add(professor);
        }
    }
}


