#include <stdio.h>

int main() {
    int x = 10;

    int *ponteiro;
    ponteiro = &x;

    printf("*** Valor atribuido a variável ***\n");
    printf("%i\n", *ponteiro);
    printf("*** Valor do ponteiro do valor atribuído ***\n");
    printf("%p\n", ponteiro);
}
