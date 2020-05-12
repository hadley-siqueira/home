public class Questao1 {

    public static void main(String[] args) {
       System.out.print(manipulacao("joão helis azevedo bernardo"));      
       System.out.println();
  }

    public static String manipulacao(String nome) {
        String[] partes = nome.split(" ");
        String primeiraLetra;
        String resto;
        String resultado;
        String palavraNova = "";
        for(int i=0; i<partes.length; i++) {
            if(partes[i].length() == 2 || partes[i].length() == 3) {
                primeiraLetra = partes[i].substring(0, 1);
            } else {
                primeiraLetra = partes[i].substring(0, 1).toUpperCase();;
            }
            resto = partes[i].substring(1);
            resultado =  primeiraLetra + resto + " ";
            palavraNova += resultado;
            }
        return palavraNova;
        
}

}

