#include <stdio.h>

void imprimirVetor(int v[], int tam) {
    for (int c = 0; c < tam; c++) {
        printf("%i " , v[c]);
    }
    printf("\n");
}

int main() {
    int numeros[10];
    int n_pares[10];
    int n_impares[10];
    int qtd_pares = 0;
    int qtd_impares = 0;
    
    for (int c = 0; c < 10; c++) {
        printf("Digite o %i° número: ", c + 1);
        scanf("%i", &numeros[c]);
        if (numeros[c] % 2 == 0) {
            n_pares[qtd_pares] = numeros[c];
            qtd_pares++;
        } else {
            n_impares[qtd_impares] = numeros[c];
            qtd_impares++;
        }
    }

    imprimirVetor(numeros, 10);
    imprimirVetor(n_pares, qtd_pares);
    imprimirVetor(n_impares, qtd_impares);
}

