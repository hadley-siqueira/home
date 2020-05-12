import java.util.Scanner;
public class joguinho {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char [] []v = new char [3] [3];
            for(int c = 0; c< 5;c++){
                System.out.println("jogador 1:");
                System.out.println("digite a coluna ");
                int coluna = s.nextInt();
                System.out.println("digite a linha : ");
                int linha = s.nextInt();
                v[linha][coluna] = 'x';
                System.out.println(v[0][0] +  "|" + v[0][1] +  "|" + v[0][2] );
                System.out.println(v[1][0] +  "|" + v[1][1] +  "|" + v[1][2] );
                System.out.println(v[2][0] +  "|" + v[2][1] +  "|" + v[2][2] ); 
     
                    System.out.println();
                    System.out.println("jogador 2:");
                    System.out.println("digite a coluna ");
                    coluna = s.nextInt();
                    System.out.println("digite a linha : ");
                    linha = s.nextInt();
                    v[linha][coluna] = 'o';
                    System.out.println(v[0][0] +  "|" + v[0][1] +  "|" + v[0][2] );
                    System.out.println(v[1][0] +  "|" + v[1][1] +  "|" + v[1][2] );
                    System.out.println(v[2][0] +  "|" + v[2][1] +  "|" + v[2][2] ); 
                        System.out.println();
                
                    }
                }
      
    static int fim(){
        char [] []v = new char [3] [3];
        int c = 0;
        if(v[0][0] == 'x' && v[0][1] == 'x' && v[0][2] == 'x'  || v[1][0] == 'x' && v[1][1] == 'x' && v[1][2] == 'x' || v[2][0] == 'x' && v[2][1] == 'x' && v[2][3] == 'x'  ) { 
             c = 10;
        } else if( v[0][0] == 'x' && v[1][0] == 'x' && v[2][0] =='x' || v[0][1] == 'x' && v[1][1] == 'x' && v[2][1] =='x' || v[0][2] == 'x' && v[1][2] == 'x' && v[2][2] =='x'){
             c = 10;
        }
        return c;
    }
}
