public class Teste {
    public static void main(String[] args) {
        Bubble b1 = new Bubble();
        System.out.println("Vetor não-ordenado");
        b1.imprimirVetor();
        b1.ordenarValores();
        System.out.println(b1.buscaBinaria(9));
    }
}
