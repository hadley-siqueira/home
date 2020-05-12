import java.util.Scanner;
    public class q9 {
        public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double a, b, c, x1, x2, d;

        System.out.print("Digite 'a': ");
        a = s.nextDouble();
        System.out.print("Digite 'b': ");
        b = s.nextDouble();
        System.out.print("Digite 'c': ");
        c = s.nextDouble();

        d = b * b - 4 * a * c;

        if (d < 0) {
        System.out.println("não tem raizes exatas!");
        }
        else if (d == 0){
        x1 = -b / (2 * a);
        System.out.println("o numero possui uma raiz igual a: " + x1);
        }
        else if (d > 0) {
        x1 = -b / (Math.sqrt(d)/2*a);
        x2 = -b / (Math.sqrt(d)/2*a);
        System.out.println("a 1ª raiz é igual há: " + x1);
        System.out.println("a 2ª raiz é igua há: " + x2);
        }
    }
}
