public class Selection {
    public int vetor[] = {10,8,6,5,1,2,7,3,9,4};
    private int menor_elemento;
    private int pos_menor;

    public void ordenarVetor() {
        for (int c = 0; c < vetor.length - 1; c++) {
            menor_elemento = vetor[c];
            pos_menor = c;
            for (int cont = c + 1; cont < vetor.length; cont++) {
                if (menor_elemento > vetor[cont]) {
                    menor_elemento = vetor[cont]; 
                    pos_menor = cont;
                }
            }
            
            vetor[pos_menor] = vetor[c];
            vetor[c] = menor_elemento;         
            System.out.println("*** " + (c + 1) + "° iteração ***");
            this.imprimirVetor();
        }

    }

    public void imprimirVetor() {
        for (int c = 0; c < vetor.length; c++) {
            System.out.print(vetor[c] + " ");
        }
        System.out.println();
    }
}
