#include <stdio.h>

int main() {
    double peso;

    printf("Digite  a quiantidade de peixes pescada: ");
    scanf("%lf", &peso);

    if (peso > 50) {
        double excesso = peso - 50;
        printf("Multa a ser paga: R$%lf", excesso * 4.0);
    } else {
        printf("Quantidade de peixes regular");
    }
}
