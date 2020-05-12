#include <stdio.h>

int main() {
    int n;

    printf("Digite o número desejado: ");
    scanf("%i", &n);

    if (n < 0) {
        printf("%i é um número negativo\n", n);
    } else {
        printf("%i é um número positivo\n", n);
    }
}
