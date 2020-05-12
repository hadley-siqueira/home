public class Insertion {
    private int vetor[] = {1, 9, 8, 6, 7, 5, 10, 2, 3, 4};
   
    public void ordenarVetor() {
        for (int c = 0; c < vetor.length - 1; c++) {
            int cont = c + 1;
            while (vetor[cont] < vetor[cont - 1] && cont >= 1) {
                int menor_elemento = vetor[cont];
                vetor[cont] = vetor[cont - 1];
                vetor[cont - 1] = menor_elemento;
                cont--;
            }
            imprimirVetor();
        }
    }

    public void imprimirVetor() {
        for (int c = 0; c < vetor.length; c++) {
            System.out.print(vetor[c] + " ");
        }
        System.out.println();
    }
}
