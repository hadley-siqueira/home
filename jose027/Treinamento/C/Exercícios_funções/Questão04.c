#include <stdio.h>
#include <math.h>

double calcularArea(double l) {
    return pow(l, 2);
}
int main() {
    double lado;
    printf("Digite a medida do lado desejado: ");
    scanf("%lf", &lado);
    printf("Área do quadrado: %lfcm²\n", calcularArea(lado));
}
