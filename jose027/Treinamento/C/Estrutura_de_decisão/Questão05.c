#include <stdio.h>

int main() {
    int n1, n2, n3;

    printf("Digite o primeiro número: ");
    scanf("%i", &n1);

    printf("Digite o segundo número: ");
    scanf("%i", &n2);

    printf("Digite o terceiro número: ");
    scanf("%i", &n3);

    if (n1 > n2 && n1 > n3) {
        printf("Maior número: %i\n", n1);
    } else if (n2 > n1 && n2 > n3) {
        printf("Maior número: %i\n", n2);
    } else if (n3 > n1 && n3 > n2) {
        printf("Maior número: %i\n", n3);
    }
}
