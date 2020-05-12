#include <stdio.h>

int main() {
    int valor;
    int nota_1 = 0;
    int nota_5 = 0;
    int nota_10 = 0;
    int nota_50 = 0;
    int nota_100 = 0;

    printf("Digite o valor desejado (entre 9 e 601): ");
    scanf("%i", &valor);

    while (valor < 10 || valor > 600) {
        printf("Valor inválido, digite novamente\n");
        printf("Digite o valor desejado (entre 9 e 601): ");
        scanf("%i", &valor);
    }

    while (valor > 0) {
        if (valor >= 100) {
            valor -= 100;
            nota_100 += 1;
        } else if (valor >= 50) {
            valor -= 50;
            nota_50 += 1;
        } else if (valor >= 10) {
            valor -= 10;
            nota_10 += 1;
        } else if (valor >= 5) {
            valor -= 5;
            nota_5 += 1;
        } else if (valor >= 1){
            valor -= 1;
            nota_1 += 1;
        }
    }
    printf("Notas de 100: %i\nNotas de 50: %i\nNotas de 10: %i\nNotas de 5: %i\nNotas de 1: %i\n", nota_100, nota_50, nota_10, nota_5, nota_1);
}
