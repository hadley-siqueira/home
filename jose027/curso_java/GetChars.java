public class GetChars {
    public static void main(String[] args) {

    /*
    Esse algoritmo pegará uma string,
    copiará trechos da string e as
    armazenará em um vetor 
    */

    String java = "Java";
    char jav[] = new char[3];
    java.getChars(0, 3, jav, 0);
    System.err.println(jav);//"System.out.print" para vetores
    }
}
