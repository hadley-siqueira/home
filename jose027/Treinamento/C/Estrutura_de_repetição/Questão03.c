#include <stdio.h>

int main() {
    double n;
    double soma = 0;

    for (int c = 0; c < 5; c++) {
        printf("Digite o %i° número: ", c + 1);
        scanf("%lf", &n);
        soma += n;
    }

    printf("Média: %lf\n", soma / 5.0);
}
