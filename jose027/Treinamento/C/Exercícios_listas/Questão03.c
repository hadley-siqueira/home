#include <stdio.h>

int main() {
    double notas[4];
    double soma = 0;

    for (int c = 0; c < 4; c++) {
        printf("Digite a %i° nota: ", c + 1);
        scanf("%lf", &notas[c]);
    }

    for (int c = 0; c < 4; c++) {
        soma += notas[c];
    }

    double media = soma / 4.0;
    printf("Média: %lf\n", media);
}
