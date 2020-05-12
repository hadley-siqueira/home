import java.util.Scanner;
    public class Questao9 {
        public static void main (String [] args) {
                 Scanner s;
                 double preço;
                 double lucro;
                 double imposto;         
                 double imptotal;
                 double distritotal;           
                 double total;

                 s = new Scanner(System.in);

                System.out.println("Olá, seja bem vindo");

                System.out.print("Me informe o valor do veiculo: ");
                preço = s.nextDouble();

                System.out.print("Me informe o lucro do destrubuidor: ");
                lucro = s.nextDouble();

                System.out.print("Me informe o imposto: ");
                imposto = s.nextDouble();

                imptotal = (imposto / 100) * preço;
                distritotal = (lucro / 100) * preço;
                total = (imptotal + preço + distritotal);


                System.out.println("O valor do lucro do distribuidor: " + distritotal);
                System.out.println("O valor aos impostos: " +imptotal);
                System.out.println("Preço final do veiculo: " + total);
    }
}
