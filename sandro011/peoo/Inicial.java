public class Inicial {

    public static void main(String[] args) {
        String resultadoDoMetodo = retornarInicial("PEOO é facil");
        System.out.println("iniciais: " + resultadoDoMetodo);
    }
    public static String retornarInicial(String texto) {
        String[] partes = texto.split(" ");
        String primeiraLetra;
        String junto = "";
        for(int i = 0; i < partes.length; i++) {
            primeiraLetra = partes[i].substring(0, 1);
            junto += primeiraLetra;
        }
        return junto;
}
}
