#include <stdio.h>

int main() {
    int n1, n2;

    printf("Digite o primeiro número: ");
    scanf("%i", &n1);

    printf("Digite o segundo número: ");
    scanf("%i", &n2);

    if (n1 > n2) {
        printf("%i é maior que %i\n", n1, n2);
    } else if (n1 < n2) {
        printf("%i é maior que %i\n", n2, n1);
    } else {
        printf("Os números são iguais\n");
    }
}
