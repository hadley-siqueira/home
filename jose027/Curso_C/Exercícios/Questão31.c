#include <stdio.h>

int main() {
    printf("*** Tabuada ***\n");
    printf("Digite um número e será gerada a tabuada do número automaticamente\n");
    int n;

    printf("Digite o número desejado: ");
    scanf("%i", &n);

    for (int c = 1; c <= 10; c++) {
        printf("%i * %i = %i\n", n, c , n*c);
    }
}
