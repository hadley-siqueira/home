public class CharAt {
    public static void main(String[] args) {
        /*
        Esse algoritmo buscará caracteres
        por meio de [indices de strings
        */
        String java = "Java";
       
        //Buscará os caracteres da string por meio de índice de forma completa 
        for (int c = 0; c < 4; c++) {
            System.out.print(java.charAt(c));
        }
        System.out.println();

        //Buscará um caratere da string por meio de índice
        System.out.println(java.charAt(2));
    }
}
