#include <stdio.h>

/*
Esse algoritmo terá uma
função que calculará o
quadrado de um número,
quando chamada
*/

void quadradoNumero() {
    int n;
    
    printf("Digite o número desejado: ");
    scanf("%i", &n);

    int quadrado = n * n;

    printf("%i² = %i \n", n, quadrado);  
}

int main() {
    quadradoNumero();
}
