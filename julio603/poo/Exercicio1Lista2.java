import java.util.Scanner;
public class Exercicio1Lista2{
    public  static void main(String[] args){
         Scanner ler = new Scanner(System.in);
         float numero1, resposta;
         System.out.println("Digite o numero: ");
         numero1 = ler.nextFloat();
            
         if (numero1 < 0){
             Math.pow(numero1, 2);
             resposta = (float) Math.pow(numero1, 2);
             System.out.println("valor do quadrado: " + resposta);
             } else { 
               Math.sqrt(numero1);
               resposta = (float) Math.sqrt(numero1);
               System.out.println("Valor da Raiz: " + resposta);
              }
        }
    }
