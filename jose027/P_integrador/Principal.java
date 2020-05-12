import java.util.Scanner;
public class Principal {
    static void logar(int matricula, Materia materia, Turma tur, Aluno aluno, Professor professor, Admin administrador) {
        if (Integer.toString(matricula).length() == 14 && tur.alunos.contains(aluno.getMatricula())) {
            System.out.println("Seja bem vindo aluno");
        } else if (Integer.toString(matricula).length() == 7 && materia.professores.contains(professor.getMatricula())) {
            System.out.println("Seja bem vindo professor");
        } else if (matricula == administrador.getMatricula()) {
            System.out.println("Seja bem vindo admin");
        }
    }

    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        
        Admin a = new Admin();
        a.setNome("Luís Fernando");
        a.setSenha("senha123");
        a.setMatricula(201716);
        
        System.out.print("Digite sua matricula: ");
        int matricula = s.nextInt();
        
        System.out.print("Digite sua senha:");
        String senha = s.next();               
    }
}

