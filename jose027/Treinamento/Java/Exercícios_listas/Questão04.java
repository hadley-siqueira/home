import java.util.Scanner;
public class Questão04 {
    static boolean ver(String l1, String l2) {
        return l1.equalsIgnoreCase(l2);
    }
    
    public static void main(String[] args) {
        String vet_v[] = {"A", "E", "I", "O", "U"};
        String vet_cons[] = new String[10];
        int qtd_cons = 0;
        Scanner s;
        s = new Scanner(System.in);

        for (int c = 0; c < 10; c++) {
            System.out.print("Digite a " + (c + 1) + "° letra: ");
            String l = s.next();
            if (ver(l, vet_v[0]) == false && ver(l, vet_v[1]) == false && ver(l,vet_v[2]) == false && ver(l, vet_v[3]) == false && ver(l, vet_v[4]) == false) {
                qtd_cons++;  
                vet_cons[c] = l;
            }
        }
        System.out.println("Quantidade de consoantes: " + qtd_cons);

        for (int c = 0; c < 10; c++) {
            if (vet_cons[c] != null) {
                System.out.print(vet_cons[c] + " ");
            } 
        }
        System.out.println();
    }
}
         
