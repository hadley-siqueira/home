import java.util.Scanner;
public class MRU {
     public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int v,sf,s0,tf,t0,x1,x2,n,v0,a,x,dt,dv,ds;
            System.out.println("escola um dos numeros a baixo");
            System.out.println("1 = espaço final");
            System.out.println("2 = variaçao de tempo ");
            System.out.println("4 =  espaço inicial");
            System.out.println("3 = velocidade");
            System.out.print("o que voce quer calcula: ");
            n = s.nextInt();
            if( n  == 1 ) {
                System.out.println("o tempo tem que tar em horas e a velicidade em km");
                System.out.println("espaço final = espaço inicial - velociade * tempo");
                System.out.print("digite a velocidade:");
                v = s.nextInt();
                System.out.print("digite o espeço inicial: ");
                s0 = s.nextInt();
                System.out.print("digite o tempo: ");
                tf = s.nextInt();
                x = v * tf;
                sf = s0 + x;
                System.out.println("sf = " + s0 + " + " + v +" x "+ tf );
                System.out.println("sf = " + s0 + " + " + x);
                if ( s0 > sf) {
                       System.out.println("sf = " + sf + " km ");
                       System.out.print("o valior deu negativo pois corpo sva retrocedendo ");
                }
                System.out.println("sf = " + sf + " km ");
                

            }else if(n == 2) {
                System.out.print("digite o tempo final final:");
                tf = s.nextInt();
                System.out.print("digite o tempo final: ");
                t0 = s.nextInt();
                dt = tf - t0;
                System.out.println("variaçao de tempo  = tempo final - tempo inicial" );
                System.out.println("vt = " +  tf + " - " + t0);
                System.out.println("vt =" + dt);
            }
            else if(n == 3){
                System.out.println("velocidade = variaçao de espaço / variaçao de tempo");
                 System.out.print("digite a tempo : ");
                    tf = s.nextInt();
                    System.out.println("digite o tempo inicil");
                    t0 = s.nextInt();
                    System.out.print("digite o espaço final: ");
                    sf = s.nextInt();
                    System.out.print("digite o espeço inicial: ");
                    s0 = s.nextInt();
                    x1 = sf - s0;
                    x2 = tf - t0;
                    v = x1 / x2;
                    System.out.println("a velocidada e dada pelo equaçao que diz que a velocidade e igual a variaçao do espaço divido pelo variaçao do tempo");
                    System.out.println("v = ( " + sf + " - " + s0 + " ) " + " / " + " ( " + tf + " - " + t0 + " )" );
                    System.out.println("v = " + x1 + " / " + x2);
                    System.out.println("v = " + v + " m/s ");
             } else if (n == 4) {
                 System.out.println("o tempo tem que tar em horas e a velicidade em km");
                 System.out.println("espalo inicial = espaço final - velocidade * tempo");
                 System.out.print("digite a velocidade:");
                    v = s.nextInt();
                    System.out.print("digite o tempo: ");
                    tf = s.nextInt();
                    System.out.print("digite o espaço final: ");
                    x = v * tf;
                    sf = s.nextInt();
                   if (sf > x) {
                        s0 = sf - x;
                    System.out.println("s0 =" + sf + " - " + v + "x" + tf);
                    System.out.println("s0 = " + sf + " - " + x);
                    System.out.println("s0 = " + s0  + " km " ) ;
                   }
                   System.out.println("o espaço inicial tem que ser maior que o produto da velocidade pelo tempo");
                   System.out.println("reenici o programa e siga o parametro acima");
             }
                   
      }

}
