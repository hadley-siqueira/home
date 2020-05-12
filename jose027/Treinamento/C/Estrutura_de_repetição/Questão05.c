#include <stdio.h>

int main() {
    int n1, n2;

    printf("Digite o primeiro número: ");
    scanf("%i", &n1);
    

    printf("Digite o segundo número: ");
    scanf("%i", &n2);

    for (int c = n1 + 1; c < n2; c++) {
        printf("%i ", c);
    }
    printf("\n");
}
