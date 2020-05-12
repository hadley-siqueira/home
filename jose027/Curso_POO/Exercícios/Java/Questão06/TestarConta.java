import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class TestarConta {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
    
        String formato1 = "###,###.##";
        DecimalFormat df1 = new DecimalFormat(formato1);
        DecimalFormatSymbols df2 = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        String formato2 = "###,###.##";
        df2.setDecimalSeparator(',');
        df2.setGroupingSeparator('.');
        df1 = new DecimalFormat(formato2, df2);
        
        ContaCorrente c1 = new ContaCorrente();
        c1.numero = 14;
        c1.saldo = 300.0;
        c1.limite = 300.0;
        c1.c_especial = false;

        System.out.print("Você deseja efetuar um saque? ");
        String opcao = s.next();
        
        if (opcao.equalsIgnoreCase("Sim")) {    
            System.out.print("Digite um valor que você deseja sacar: R$");
            double valor  = s.nextDouble();

            if (c1.saque(valor) == true) {
                System.out.println("Saque efetuado com sucesso");
            } else {
                System.out.println("Saldo insuficiente para a realização de saque");            
            }
        }
        c1.consultaSaldo();
        c1.status();
    }
}
