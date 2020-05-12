#include <stdio.h>
/*
Esse algoritmo irá pedir para o usuário
digitar alguns números em uma determinada 
quantidade de vezes referente ao espaço
dos vetores propostos, após irá criar um
novo vetor, e novo vetor terá os valores
que são a soma dos valores dos índices 
correspondentes dos dois vetores propostos  
*/
int main() {
    int n;
    int v1[4], v2[4];

    for (int c = 0; c < 4; c++) {
        printf("Digite o número desejado: ");
        scanf("%i", &n);
        v1[c] = n;
    }

    for (int c = 0; c < 4; c++) {
        printf("Digite o número desejado: ");
        scanf("%i", &n);
        v2[c] = n;
    }
    
    int v3[4] = {v1[0] + v2[0], v1[1] + v2[1], v1[2] + v2[2], v1[3] + v2[3]};
    
    for (int c = 0; c < 4; c++ ) {
        printf("|%i|", v3[c]);
    }
    printf("\n");
}
