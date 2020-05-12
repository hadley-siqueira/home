public final class Admin extends Pessoa {
    //Métodos para "professor"
    public void criarProfessor(String nome, String senha, int matricula, Materia m) {
        Professor p = new Professor(nome, senha, matricula, m);
    }
    
    public void removerProfessor(Materia m, int matricula) {
        for (int c = 0; c < m.professores.size(); c++) {
            if (matricula == m.professores.get(c).getMatricula()) {
                m.professores.remove(m.professores.get(c));
                break;
            }
        }
    }
    //Métodos para "Aluno"
    public void criarAluno(String nome, String senha, Curso cur, Turma tur, int matricula) {
        Aluno a = new Aluno(nome, senha, cur, tur, matricula);  
    }
    
    public void removerAluno(Turma t, int matricula) {
        for (int c = 0; c < t.alunos.size(); c++) {
            if (matricula == t.alunos.get(c).getMatricula()) {
                t.alunos.remove(t.alunos.get(c));
                break;
            }
        }
    }
    //Métodos para "matéria"
    public void criarMateria(String nome, int codigo) { 
        Materia m = new Materia (nome, codigo);
    }
    
    public void removerMateria(Curso cur, String nome) {
        for (int c = 0; c < cur.materias.size(); c++) {
            if (nome.equalsIgnoreCase(cur.materias.get(c).getNome())) {
                cur.materias.remove(cur.materias.get(c));
                break;
            }
        }
    }
    //Métodos para "curso"
    public void criarCurso(String nome, String codigo) {
        Curso c = new Curso(nome, codigo);
    }
    
    //Métodos para "turma"
    public void criarTurma(String nome, Curso c) {
        Turma t = new Turma(nome, c);
    }
    
    public void removerTurma(Curso cur, String nome) {
        for (int c = 0; c < cur.turmas.size(); c++) {
            if (nome.equalsIgnoreCase(cur.turmas.get(c).getNome())) {
                cur.turmas.remove(cur.turmas.get(c));
                break;
            }
        }
    }
}

