#include <stdio.h>

int main() {
    int n, comeco, fim;

    printf("Montar tabuada de : ");
    scanf("%i", &n);

    printf("Começo: "); 
    scanf("%i", &comeco);

    printf("Fim: ");
    scanf("%i", &fim);

    for (int c = comeco; c <= fim; c++) {
        printf("%i X %i = %i\n", n, c, n * c);
    }
}
