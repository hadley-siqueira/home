#include <stdio.h>

int main() {
    double n_reais[10];

    for (int c = 0; c < 10; c++) {
        printf("Digite o %i° número: ", c + 1);
        scanf("%lf", &n_reais[c]);
    }

    for (int c = 0; c < 10; c++) {
        printf("%lf ", n_reais[c]);
    }
    printf("\n");

    for (int c = 9; c >= 0; c--) {
        printf("%lf ", n_reais[c]);
    }
    printf("\n");
}
