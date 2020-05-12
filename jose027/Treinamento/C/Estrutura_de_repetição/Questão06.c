#include <stdio.h>

int main() {
    int n;

    printf("Digite o número desejado: ");
    scanf("%i", &n);

    for (int c = 1; c <= 10; c++) {
        printf("%i X %i = %i\n", n, c, n * c);
    }
}
