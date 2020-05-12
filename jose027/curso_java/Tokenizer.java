import java.util.StringTokenizer;
public class Tokenizer {
    public static void main(String[] args) {
        /*
        Esse algoritmo pegará uma string
        e extrairá "tokens" da string
        */
        String arquivo = "1;Antônio;30;";
        StringTokenizer st = new StringTokenizer(arquivo, ";");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        } 
    }
}
