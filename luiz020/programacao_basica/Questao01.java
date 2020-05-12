

import java.util.Scanner;

public class Questao01 {

       public static void main (String[] args){
               //TODO Auto-generated method stub
       
       int n1,mult=0,cont;

              Scanner k = new Scanner (System.in);


              System.out.println("Informe o numero para a tabuada: ");
              n1=k.nextInt();

              for (cont=0 ; cont<=10 ; cont++ ){
              
                      mult=cont*n1;

                      System.out.println(n1+" X "+ cont + " = "+mult);

              }}}
