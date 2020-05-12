import java.util.Scanner;
    public class Matriz {
        public static void main(String[] args) {
            double [][]mediaAlunos = new double [4][3];
            
            mediaAlunos[0][0] = 9.5; 
            mediaAlunos[0][1] = 8;
            mediaAlunos[0][2] = 7.5; 
            
            mediaAlunos[1][0] = 9.9;
            mediaAlunos[1][1] = 10; 
            mediaAlunos[1][2] = 8; 
            
            mediaAlunos[2][0] = 0; 
            mediaAlunos[2][1] = 10; 
            mediaAlunos[2][2] = 9; 
            
            mediaAlunos[3][0] = 0.9; 
            mediaAlunos[3][1] = 1; 
            mediaAlunos[3][2] = 2.7;
             
            for (int c = 0; c < mediaAlunos.length; c ++) {
               for (int cont = 0; cont < mediaAlunos[c].length; cont ++) {
                    System.out.print(mediaAlunos[c][cont] + " ");
                }
               System.out.println();            
        }          
    }
}
