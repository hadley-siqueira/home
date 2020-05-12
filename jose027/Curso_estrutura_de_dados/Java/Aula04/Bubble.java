import static java.lang.Math.*;
public class Bubble {
    public int vetor[] = {10,2,1,3,6,4,8,5,9,0};
  
    public void ordenarValores() {
        for (int c = 0; c < vetor.length - 1; c++) {
            System.out.println(c +"° Iteração");
            for (int cont = 0; cont < vetor.length - 1; cont++) {
                if (vetor[cont] > vetor[cont + 1]) {
                    int menor_elemento = vetor[cont + 1];
                    vetor[cont + 1] = vetor[cont];
                    vetor[cont] = menor_elemento;
                }
            }
            this.imprimirVetor();
        }
    }

    public int buscaBinaria(int elemento) {
        int inicio = 0;
        int meio = round(vetor.length / 2);
        int fim = vetor.length - 1;
        int pos_encontrada = -1;

        while (elemento < vetor[meio] && fim > inicio) {
            fim = meio - 1;
            meio = round((fim + 1) / 2);
        }

        while (elemento > vetor[meio] && inicio <= fim) {
            inicio = meio + 1;
            meio = round((fim + 1) / 2);
        }
    
        for (int c = inicio; c <= fim; c++) {
            if (elemento == vetor[c]) {
                pos_encontrada = c;
            }
        }

        return pos_encontrada;
    }

    public void imprimirVetor() {
        for (int c = 0; c < vetor.length; c++) {
            System.out.print(vetor[c] + " ");
        }
        System.out.println();
    }
}
