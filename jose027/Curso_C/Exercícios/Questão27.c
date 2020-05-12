#include <stdio.h>

int main() {
    int tam;
    printf("Digite o tamanho que você deseja para o vetor: ");
    scanf("%i", &tam);
    while (tam % 2 == 0 || tam == 1) {
         printf("Digite o tamanho que você deseja para o vetor: ");
         scanf("%i", &tam);
    }
    
    int vetor[tam];
    int n;
    
    for (int c = 0; c < tam; c++) {
        printf("Digite o número desejado: ");
        scanf("%i", &n);   
        vetor[c] = n; 
    }
 
    printf("*** Vetor digitado ***\n");    
    for (int c = 0; c < tam; c++) {
        printf("|%i|", vetor[c]);
    }
    printf("\n");

    printf("*** Produto dos elementos ***\n");
    if (tam > 3) {
        printf("|%i|%i||%i|\n", vetor[0], vetor[(tam-1)/2], vetor[tam-1]);
        int produto_elementos =  vetor[0] * vetor[(tam - 1)/2] * vetor[tam-1];
        printf("%i\n", produto_elementos);
    } else if (tam == 3) {
        printf("%i\n", vetor[0]);
    }

    int soma = 0;    
    for (int c = 0; c < (tam-1)/2; c++) {
        soma += vetor[c];
    }
    printf("*** Média dos números ***\n");
    float media = soma / float(tam / 2);
    printf("%f\n", media);

    printf("*** Números divísiveis por 2 e por 5 ***\n");
    int qtd_divisiveis = 0;
    int qtd_indices = (tam - 1) / 2;
    int vetor_divisiveis[qtd_indices];

    for (int c = 0; c < tam / 2 ; c++) {
        if (vetor[((tam - 1) / 2 + c) + 1] % 2 == 0 && vetor[((tam - 1) / 2 + c) + 1] % 5 == 0) {
            vetor_divisiveis[qtd_divisiveis] = vetor[((tam - 1) / 2 + c) + 1];
            printf("|%i|", vetor_divisiveis[qtd_divisiveis]);
            qtd_divisiveis += 1;
        }
    }
    printf("\n");
}

