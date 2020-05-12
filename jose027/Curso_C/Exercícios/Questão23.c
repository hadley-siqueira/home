#include <stdio.h>

int main() {
    int n;
    int vetor[10];
    int soma = 0;
    int qtd_abaixo = 0;
    int vetor_media[qtd_abaixo];

    for (int c = 0; c < 10; c++) {
        printf("Digite o %i° número: ", c + 1);
        scanf("%i", &n);
        vetor[c] = n;
    }

    printf("*** Vetor de números digitados ***\n");    
    for (int c = 0; c < 10; c++) {
        printf("|%i|", vetor[c]);
    }
    printf("\n");
    
    for (int c = 0; c < 10; c++) {
        soma += vetor[c];
    }

    float media = soma / 10.0;

    printf("Média: %f\n", media);

    for (int c = 0; c < 10; c++) {
        if (vetor[c] < media) {
            vetor_media[qtd_abaixo] = vetor[c];
            qtd_abaixo += 1; 
        }
    }

    printf("*** Vetor de números abaixo da média ***\n");
    for (int c = 0; c < qtd_abaixo; c++) {
        printf("|%i|", vetor_media[c]);
    }
    printf("\n");
}
