#include <stdio.h>

int main() {
    int n;

    printf("Digite o numero desejado: ");
    scanf("%i", &n);
    printf("%i\n", n);

    while (n < 10000) {
        n *= 3;
        printf("%i\n", n);
    }
    printf("Algoritmo finalizado\n");
}
