#include <stdio.h>

int main() {
    int soma = 0;
    int mult = 1;
    int numeros[5];

    for (int c = 0; c < 5; c++) {
        printf("Digite o %i° número: ", c + 1);
        scanf("%i", &numeros[c]);
        soma += numeros[c];
        mult *= numeros[c];
    }

    printf("Soma: %i\nMultipliação: %i\n", soma, mult);

    for (int c = 0; c < 5; c++) {
        printf("%i ", numeros[c]);
    }
    printf("\n");
}
