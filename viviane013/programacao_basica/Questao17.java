import java.util.Scanner;
public class Questao17 {
        public static void main(String[] args) {
            Scanner s;
            double moedas;
            double um;
            double moeda;
            double cinco;
            double moed;
            double dez;
            double moe;
            double vinte;
            double mo;
            double cinq;
            double m;
            double real;
            double prim;
            double seg;
            double ter;
            double quar;
            double quin;
            double sex;
            double calc;

            s = new Scanner(System.in);

            System.out.println("Contador de moedas");
            System.out.print("Quantas moedas de um centavo voce tem? ");
            moedas = s.nextDouble();
            um = 0.1;

            System.out.print("Quantas moedas de cinco centavos voce tem? ");
            moeda = s.nextDouble();
            cinco = 0.5;

            System.out.print("Quantas moedas de dez centavos voce tem? ");
            moed = s.nextDouble();
            dez = 0.10;

            System.out.print("Quantas moedas de vinte e cinco centavos voce tem? ");
            moe = s.nextDouble();
            vinte = 0.25;

            System.out.print("Quantas moedas de cinquenta centavos voce tem? ");
            mo = s.nextDouble();
            cinq = 0.50;

            System.out.print("Quantas moedas de um real voce tem? ");
            m = s.nextDouble();
            real = 1;
            
            prim = moedas * um;
            seg = moeda * cinco;
            ter = moed * dez;
            quar = moed * vinte;
            quin = mo * cinq;
            sex = m * real;

            calc = prim + seg + ter + quar + quin + sex;
            System.out.println("O total de dinheiro que voce tem eh: " + calc);
    }
}






