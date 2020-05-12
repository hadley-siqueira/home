import java.util.ArrayList;
public final class Curso {
    private String nome, codigo;
    ArrayList <Turma> turmas = new ArrayList();
    ArrayList <Materia> materias = new ArrayList();

    public Curso(String nome, String codigo, Campus cam) {
        this.nome = nome;
        this.codigo = codigo;
        cam.inserirCurso(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void SetCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void inserirTurma(Turma turma) {
        if (turma.getNome().contains(this.codigo) == true) {
            turmas.add(turma);
        }
    }
    
    public void inserirMateria(Materia materia) {
        materias.add(materia);
    }
}

