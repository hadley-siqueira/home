#include <stdio.h>

int main() {
    int n;

    printf("Digite a nota desejada: ");
    scanf("%i", &n);

    while (n < 0 || n > 10) {
        printf("Número digitado inválido, digite novamente\n");
        printf("Digite a nota desejada: ");
        scanf("%i", &n);
    }
    printf("Número digitado: %i\n", n);
}
