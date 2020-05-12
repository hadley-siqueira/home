#include <stdio.h>

int main() {
    int n;
    int qtd_n_par = 0;

    for (int c = 0; c < 10; c++) {
        printf("Digite o %i° número: ", (c + 1));
        scanf("%i", &n);

        if (n % 2 == 0) {
            qtd_n_par += 1;
        }
    }
    printf("Quantidade de números pares: %i\n", qtd_n_par);
    printf("Quantidade de números ímpares: %i\n", 10 - qtd_n_par);
}
