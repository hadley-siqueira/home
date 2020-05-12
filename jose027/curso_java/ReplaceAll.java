public class ReplaceAll {
    public static void main(String[] args) {
        /*
        Esse algoritmo pegará uma string com 
        espaços e tirará seus espaços entre 
        as letras
        */
        String semEspacos = "e s p a ç o";
        System.out.println(semEspacos);
        System.out.println(semEspacos.replaceAll(" ", ""));
    }
}
